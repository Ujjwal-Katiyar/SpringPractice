package ConstructorInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Addresh  {
	private String village;

	private String district;

	public Addresh(String village, String district) {
		super();
		this.village = village;
		this.district = district;
	}

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

	@Override
	public String toString() {
		return "Addresh [village=" + village + ", district=" + district + "]";
	}
@PreDestroy
	public void destroy() throws Exception {
  System.out.println("This is the destory method");
		
	}
@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("This is the after proprtises set");
	}

}
