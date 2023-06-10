package com.yedam.abstracts;

public class AnimalExe {

	public static void main(String[] args) {
		// 추상 클래스 -> 실체 클래스. (X)
		Animal animal = null; //추상클래스여서 만들수 없음
		animal = new Bird();
		animal.breathe();
		animal.sound();
	
		Bird bird = new Bird();
		bird.breathe();
		bird.sound();
		
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
	}

}
