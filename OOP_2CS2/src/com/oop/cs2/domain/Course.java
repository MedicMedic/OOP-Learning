package com.oop.cs2.domain;

public class Course 
{
	private String courseCode;
	private String description;
	private Integer unit;
	private String day;
	private String time;
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String toString() 
	{
		String courseOutput = new String();		
		
		courseOutput += courseCode + "\t" + description + "\t" +
						unit + "\t" + day + "\t" + time + "\n";
		
		return courseOutput;
	}
}
