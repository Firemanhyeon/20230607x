package com.yedam.abstracts;

public class Bird extends Animal {

	// animal에서 추상 메소드가 있어서 자식클래스에서 구현해줘야함
	@Override
	void sound() {
		System.out.println("짹짹짹");
	}

}
