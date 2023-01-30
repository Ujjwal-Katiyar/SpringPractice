package Injection;

import java.util.List;

public class Student {



	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", addresh=" + addresh + ", phoneNo=" + phoneNo + "]";
	}

	private String name;
	private String rollNo;

	public List getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List phoneNo) {
		this.phoneNo = phoneNo;
	}

	private Addresh addresh;
	private List phoneNo;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		System.out.println("sert nME");
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public Addresh getAddresh() {
		return addresh;
	}

	public void setAddresh(Addresh addresh) {
		this.addresh = addresh;
	}

}
