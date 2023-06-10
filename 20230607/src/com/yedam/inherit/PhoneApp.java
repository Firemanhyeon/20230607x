package com.yedam.inherit;

public class PhoneApp {

	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setModel("Gallexy");
		cell.setColor("White");
		cell.powerOn();
		cell.powerOff();
		
		DmbCellPhone dmb = new DmbCellPhone();
		dmb.setModel("Gallexy2");
		dmb.setColor("Black");
		dmb.setChannel(100);
		dmb.powerOn();
		dmb.powerOff();
		
		// 부모클래스의 변수타입  = 자식클래스의 인스턴스 할당
		CellPhone cell1 = new DmbCellPhone(); // promotion 자동형변환
		cell1.setModel("Gallexy2");
		cell1.setColor("Yello");
//		cell1.setChannel(100); // 불가능 cellphone에 할당된 메소드들만 사용가능
		
		if(cell1 instanceof DmbCellPhone) { // cell1의 변수 유형이 DmbCellPhone 인스턴스인지 확인
			DmbCellPhone dmb1 = (DmbCellPhone) cell1; // 부모 -> 자식 변환 가능 casting 강제형 변환
			dmb1.setChannel(100);
			dmb1.powerOn();			
		}
		
		if(cell instanceof DmbCellPhone) {
			DmbCellPhone dmb2 = (DmbCellPhone) cell; // dmbcellphone 인스턴스가 아니라서
			dmb2.setChannel(200); // 문법상 오류가 없는데 실행 오류가 뜸			
		}
		
		// int, double => Integer, Double
		int num = 20;
		num = new Integer(30); // 30정수의 값을 담고 있는 인스턴스 
		
	}

}
