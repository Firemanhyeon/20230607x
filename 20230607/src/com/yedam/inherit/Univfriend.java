package com.yedam.inherit;

// 학교친구: 이름/연락처/학교/전공
public class Univfriend extends Friend {
	// field
	private String univ;
	private String major;
	
	
	// constructor	

	public Univfriend() {
		super();
	}
	
	public Univfriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}
	
	
	// getter, setter
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String showInfo() {
		return "이름은 " + this.getName()+ ", 연락처 " + this.getPhone() +", 학교는 " + univ + ", 전공 " + major; // 메소드를 통해서 불러와야함 , getName() 여기에는 없지만 부모에서 가져와서 쓸수 있음
	}
	
	
	
	
}
