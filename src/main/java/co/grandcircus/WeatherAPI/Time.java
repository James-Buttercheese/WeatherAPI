package co.grandcircus.WeatherAPI;

import java.util.Arrays;

public class Time {
	
	String[] startPeriodName;

	public String[] getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(String[] startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	@Override
	public String toString() {
		return "Time [startPeriodName=" + Arrays.toString(startPeriodName) + "]";
	}
	

}
