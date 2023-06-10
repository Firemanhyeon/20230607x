package com.yedam.inherit;

public class DmbCellPhone extends CellPhone{
	private int channel;
	public DmbCellPhone() {
		super(); // 부모클래스의 생성자를 가르킴(기본 생성자가 있어야함)
	}
	
	public DmbCellPhone(String model, String color) {
		super(model,color);
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color);
		this.channel = channel;
	}
	// getter, setter
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	// 재정의
	@Override // 부모가 가진 메소드를 재정의 - override가 없으면 dmbcellphone 메소드 정의하는 것
	public void powerOn() {
		System.out.println("Dmb 전원을 켭니다");
	}
	
	@Override
	public void powerOff() {
		System.out.println("Dmb 전원을 끕니다");
	}
	
	@Override
	public String toString() { // 클래스는 Object 클래스 상속
		return "모델은 " +  this.getModel() + "컬러는 " + this.getColor();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	
}
