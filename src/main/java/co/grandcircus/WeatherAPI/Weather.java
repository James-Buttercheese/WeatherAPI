package co.grandcircus.WeatherAPI;

public class Weather {
	
	private Location location;
	Data data;
	Time time;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Weather [location=" + location + ", data=" + data + ", time=" + time + "]";
	}
	
	

}
