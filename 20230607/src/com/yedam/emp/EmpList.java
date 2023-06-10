package com.yedam.emp;

import java.util.Scanner;

// EmpList : EmpArray(배열), EmpArrayList(ArrayList)를 활용해서 처리
public abstract class EmpList {
	
	Scanner scan = new Scanner(System.in);
	
	abstract void init(); // 저장공간 초기화. 배열 = new Employee[10]
	                      // ArrayList = new ArrayList();
	
	abstract void input(); // 사원정보 입력.
	
	abstract String search(int employeeId); // 사원정보 조회
	
	abstract void print(); // 사원목록 출력.
	
}
