package Injection;

public class Addresh {
	private String village;

	@Override
	public String toString() {
		return "Addresh [village=" + village + ", district=" + district + "]";
	}

	private String district;

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
