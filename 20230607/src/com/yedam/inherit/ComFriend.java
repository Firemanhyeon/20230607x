package com.yedam.inherit;

public class ComFriend extends Friend {
	private String company;
	private String department;
	
	
	
	
	public ComFriend() {
		super();
	}

	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String showInfo() {
		return "이름은 " + this.getName()+ ", 연락처 " + this.getPhone() +", 회사는 " + company + ", 부서는 " + department;
	}
	
}
