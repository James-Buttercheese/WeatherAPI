package co.grandcircus.WeatherAPI;

public class Storage {
	
	private String day;
	private String conditions;
	
	
	public Storage(String day, String conditions) {
		super();
		this.day = day;
		this.conditions = conditions;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	@Override
	public String toString() {
		return "Storage [day=" + day + ", conditions=" + conditions + "]";
	}

}
