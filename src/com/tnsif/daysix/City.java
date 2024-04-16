//Program to demonstrate the multilevel inheritance
package com.tnsif.daysix;

public class City extends State
{
    private String cityname;
    private String area;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", area=" + area + ", getCityname()=" + getCityname() + ", getArea()="
				+ getArea() + ", getStatename()=" + getStatename() + ", getLanguage()=" + getLanguage()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
    
    

}
