package com.yedam.inherit;


// 친구의 정보를 저장. 이름/연락처 => friend 
// 학교친구 - 이름/연락처/학교이름/전공 => univfriend 
// 최사친구 - 이름/연락처/회사명/부서 => comfriend
public class FriendApp {
	
	public static void main(String[] args) {
		FriendExe exe = new FriendExe();
		exe.execute();
//		method();
	}
	public static void method() {
		Friend[] friends = new Friend[10];
//		Univfriend univs = new Univfriend[10]; // 상속 안하면 써야함
		
		friends[0] = new Friend("홍길동", "010-1111");
		friends[1] = new Univfriend("김민기", "010-2222","대구", "역사");
		friends[2] = new ComFriend("박호섭", "010-3333", "네이버", "개발부서");
		
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null) {

				System.out.println(friends[i].showInfo());				
			}
		}
		
	}
}
