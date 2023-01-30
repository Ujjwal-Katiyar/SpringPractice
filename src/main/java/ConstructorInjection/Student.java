package ConstructorInjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private String rollNo;
	
	private Addresh addresh;
	private List<Integer> phoneNo;

	public Student(Addresh addresh) {
		super();
		this.addresh = addresh;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String rollNo, Addresh addresh, List<Integer> phoneNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.addresh = addresh;
		this.phoneNo = phoneNo;
	}

	public List getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", addresh=" + addresh + ", phoneNo=" + phoneNo + "]";
	}
	public void last()
	{
		System.out.println("This is the last method");
	}
	public void first()
	{
		System.out.println("This is the first method");
	}

}
