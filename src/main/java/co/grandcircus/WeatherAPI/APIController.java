package co.grandcircus.WeatherAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class APIController {
	
	@Autowired
	private ApiService apiServ;
	
	@RequestMapping("/")
	public ModelAndView main() {
		
		return new ModelAndView("index");
	}
	
//	@RequestMapping("/weather") 
//	public ModelAndView weather(@RequestParam Double latitude, @RequestParam Double longitude) {
//		
//		Weather weather = apiServ.getWeather(latitude, longitude);
//		
//		List<String> days = new ArrayList<>();
//		List<String> weathers = new ArrayList<>();
//		List<String> pleaseWork = new ArrayList<>();
//		
//		ModelAndView mav = new ModelAndView("weather");
//		for (String text : weather.getData().getText()) {
//			String spn = text;
//			weathers.add(spn);
//			
//		}
//		
//		
//		for (int i = 0; i < weather.time.startPeriodName.length; i++) {
//			String spn = weather.time.startPeriodName[i];
//			days.add(spn);
//		}
//		
//		for (int i = 0; i < days.size() ; i++) {
//			pleaseWork.add(days.get(i) + "     " + weathers.get(i));
//		}
//		
//		mav.addObject("weather", pleaseWork);
//		
//		return mav;
//	}
	
	@RequestMapping("/weather") 
	public ModelAndView weather(@RequestParam Double latitude, @RequestParam Double longitude) {
		
		Weather weather = apiServ.getWeather(latitude, longitude);
		
		int i = weather.data.text.length;
		
		List<Storage> storage = new ArrayList<>();
		
		for (int o = 0; o < i; o++) {
			storage.add(new Storage (weather.time.startPeriodName[o], weather.data.text[o]));
		}
				
		return new ModelAndView("weather", "storage", storage);
	}

}
