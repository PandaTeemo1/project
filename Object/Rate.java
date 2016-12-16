package file.Object;

import java.io.Serializable;

public class Rate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8745317900298841798L;
	private double month;
	private double year;
	public Rate(){}
	
	public Rate(double month, double year) {
		super();
		this.month = month;
		this.year = year;
	}
	public double getMonth() {
		return month;
	}
	public void setMonth(double month) {
		this.month = month;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	
	
}
