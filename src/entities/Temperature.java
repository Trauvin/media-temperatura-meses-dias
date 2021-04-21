package entities;


public class Temperature {
	
	private String month;
	private double temp;
	private Integer days;

	public Temperature() {
	}
	
	public Temperature(String month, double temp, Integer days) {
		super();
		this.month = month;
		this.temp = temp;
		this.days = days;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "No dia " + days + 
				" de " + month + 
				" a temperatura foi de " + temp + " C";
	}
	
	
}
