package entities;


public class Temperature {
	
	private String month;
	private double temp;

	public Temperature() {
	}
	
	public Temperature(String month, double temp) {
		this.month = month;
		this.temp = temp;
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

	@Override
	public String toString() {
		return "Temperature [month=" + month + ", temp=" + temp + "]";
	}
	
	
	
	
}
