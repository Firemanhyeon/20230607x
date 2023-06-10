package com.yedam.inherit;

public class Friend {
	// Field
	private String name;
	private String phone;
	
	// Constructor
	public Friend(){
		
	}
	
	public Friend(String name, String phone){
		this.name = name;
		this.phone = phone;
	}

	
	// Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String showInfo() {
		return "이름은 " + name + ", 연락처" + phone;
	}
	

}
