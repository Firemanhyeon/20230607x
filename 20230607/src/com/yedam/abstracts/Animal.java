package com.yedam.abstracts;


// 추상클래스.
public abstract class Animal {
	String kind;
	
	Animal(){
		
	}
	
	Animal(String kind){
		this.kind = kind;
	}
	
	void breathe() { // 기능 구현.
		System.out.println("숨을 쉽니다!");
	}
	
	// 추상메소드 -> 자식클래스에서 반드시 구현.(강제로 사용하게 만들고 싶을때)
	abstract void sound();
}
