package co.grandcircus.WeatherAPI;

import java.util.Arrays;

public class Data {
	
	String[] text;

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Data [text=" + Arrays.toString(text) + "]";
	}
	

}
