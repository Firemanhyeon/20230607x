package com.yedam.emp;

public class EmpListApp {
	public static void main(String[] args) {
		EmpList app = new EmpArray(); // 추상 클래스
		app = new EmpArrayList(); // 코드를 최대한 변경하지 않을려고
		
		app.init();
		
		app.input();
		
//		app.search();
		
		app.print();
	}
}
