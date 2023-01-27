package COM.SPRING.SpringRevision;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", addresh=" + addresh + "]";
	}

	private String name;
	private String rollNo;
	private String addresh;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddresh() {
		return addresh;
	}

	public void setAddresh(String addresh) {
		this.addresh = addresh;
	}

}
