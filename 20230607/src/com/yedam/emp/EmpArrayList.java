package com.yedam.emp;

import java.util.ArrayList;

public class EmpArrayList extends EmpList{
	ArrayList employees;
	
	
	@Override
	void init() {
		employees = new ArrayList();
	}

	@Override
	void input() {
		System.out.printf("%d 사번> ", employees.size());
		int no = scan.nextInt();
		
		System.out.print("이름> ");
		String name =scan.next(); // 이전의 엔터키 처리할려고 사용
		
		System.out.print("급여> ");
		int salary = scan.nextInt();


		employees.add(new Employee(no,name,salary));
	}

	@Override
	String search(int employeeId) {
		for(int i =0; i<employees.size(); i++) {
			Employee emp = (Employee) employees.get(i);
			if(emp.getEmployeeId() == employeeId) {
				return emp.getName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i =0; i<employees.size(); i++) {
			Employee emp =(Employee) employees.get(i);
			System.out.println( "사원번호: " + emp.getEmployeeId() +"이름 : " + emp.getName() + "급여 : " + emp.getSalary());
//			System.out.println(((Employee) employees.get(i)).getName()); < 이렇게도 가능
		}
	}

}
