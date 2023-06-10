package com.yedam.emp;

import java.util.ArrayList;


class Member{
	private String memberId;
	private String membername;
	private int score;
	
	Member(String memberId, String memberName, int score){
		this.memberId = memberId;
		this.membername = memberName;
		this.score = score;
	}

	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}


// 배열 > 컬렉션.
public class ArrayExe {

	public static void main(String[] args) {
		
		ArrayList members = new ArrayList();
		members.add(new Member("001","홍길동",100));
		members.add(new Member("002","김길동",200));

		
		for(int i =0; i<members.size(); i++) {
			Member member = (Member) members.get(i);
//			System.out.println(member.getMembername());
			if(member.getMembername().equals("홍길동")) {
//				members.remove(i);
				members.set(i, new Member("010","김민식",150));
			}
		}
		
		for(int i =0; i<members.size(); i++) {
			Member member = (Member) members.get(i);
			System.out.println(member.getMembername());
			
		}
		
		
//		ArrayList arry = new ArrayList(); //제네릭 타입 / 크기 지정X
//		arry.add("홍길동");
//		arry.add("김길동");
//		arry.add("박길동");
//		arry.add(new Integer(100)); // object 어떤 값도 다 담을수있지만 출력할때가 문제 arry.add(100)
//		
//		
//		arry.remove(1); // 삭제하면 2->1
//		
//		arry.set(0, "황길동"); // 수정
//		for(Object name : arry) {
//			System.out.println((String)name);
//		}
//		
//		for(int i =0; i<arry.size(); i++) { // arraylist -> length가 없어서 size사용
//			System.out.println(arry.get(i)); // null이 아닌 값들을 가져옴
//		}
	}

}
