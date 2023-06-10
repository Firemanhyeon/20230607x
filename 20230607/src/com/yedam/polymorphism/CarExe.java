package com.yedam.polymorphism;

public class CarExe {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i =0; i<=6; i++) {
			int problemLocation = car.run();
			System.out.println(i);
			switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽에 HankookTire 교체.");
					car.frontLeft = new HankookTire("앞왼쪽", 10);
					break;
				case 2:
					System.out.println("앞오른쪽에 KumhoTire 교체.");
					car.frontRight = new KumhoTire("앞오른쪽", 11);
					break;
				case 3:
					System.out.println("뒤 왼쪽에 HankookTire 교체.");
					car.backLeft = new HankookTire("뒤왼쪽", 10);
					break;
				case 4:
					System.out.println("뒤 왼쪽에 HankookTire 교체.");
					car.backRight = new KumhoTire("뒤오른쪽", 11);
					break;
					
			}
			System.out.println("-------------------");
		}
	}

}
