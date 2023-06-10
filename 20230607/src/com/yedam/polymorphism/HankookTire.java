package com.yedam.polymorphism;

public class HankookTire extends Tire {

	// 생성자
//	HankookTire(){
//		super();
//	}
	
	//  
	HankookTire(String location, int maxRotation){
		super(location,maxRotation);
	}
	
	//
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation() + 1);
		if(getAccumulatedRotation() < getMaxRotation()) {
			System.out.println("한국타이어 " + (getMaxRotation() - getAccumulatedRotation()) + " 회 "  + " 위치 " + getLocation());
			return true;
		}else {
			System.out.println("한국타이어 " + "펑크 ***" + "위치" + getLocation());
			return false;
		}
	}

}
