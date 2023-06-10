package com.yedam.emp;

public class EmpArray extends EmpList{
	
	Employee[] employees;
	int empNum; // 배열 위치
	
	
	
	@Override
	void init() { // 배열의 크기를 정하는 것
		System.out.print("사원수 입력>");
		int num = Integer.parseInt(scan.nextLine()); // "10" -> 값이 있어야함 
		employees = new Employee[num];
	}

	@Override
	void input() {
		System.out.printf("%d 사번> ", empNum);
		int no = scan.nextInt();
		
		System.out.print("이름> ");
		String name =scan.next(); // 이전의 엔터키 처리할려고 사용
		
		System.out.print("급여> ");
		int salary = scan.nextInt();
		employees[empNum] = new Employee(no,name,salary);
	}

	@Override
	String search(int employeeId) {
		for(int i =0; i<employees.length; i++) {
			if(employees[i] != null && employees[i].getEmployeeId() == employeeId) {
				return employees[i].getName();
			}
		}
		return null; // 찾는 값이 없으면 null
	}

	@Override
	void print() {
		for(int i =0; i<employees.length; i++) {
			if(employees[i] != null) {
				System.out.printf("%5d %10s %7d\n" , employees[i].getEmployeeId(), employees[i].getName(), employees[i].getSalary());
			}
		}
	}

}
