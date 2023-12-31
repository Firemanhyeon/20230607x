package com.yedam.inherit;

public class CellPhone extends Object{ // 최상위 Object 생략되어 있음
	private String model;
	private String color;
	
	public CellPhone() {
		
	} // <- 호출
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전월을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice() {
		System.out.println("메세지 전송.");
	}
	public void receiveVoice() {
		System.out.println("메세지 수신");
	}
}
