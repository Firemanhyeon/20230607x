package com.yedam.polymorphism;

// 상속 - 다형성
public class DriverExe {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		// 부모 변수유형 = 자식인스턴스.
		driver.drive(vehicle);
		driver.drive(bus); // bus taxi가 vehicle 자식클래스라서 사용가능
		driver.drive(taxi); 
		
	}

}
