//program to demonstrate single level inheritance
package com.tnsif.daysix;
//derived class
public class Student
{
	private int rollNo;
	private String collegeName;
	
	public Student()
	{
		super();//keyword
	}

	public Student(int rollNo, String collegeName) {
		super();
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
				+ ", getCollegeName()=" + getCollegeName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
