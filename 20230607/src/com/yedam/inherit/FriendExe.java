package com.yedam.inherit;

import java.util.Scanner;

// 추가/수정/삭제/목록
// 친구:학교친구(이름,연락처,학교,잔공)/ 회사친구(이름,연락처,회사,부서)/ 친구(이름,연락처)
// 수정: 이름조회 => 학교:학교, 전공/ 회사: 회사이름,부서이름/친구:연락처
public class FriendExe {
	Scanner scan = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	public void execute() {
		boolean run = true;
		while (run) {
			System.out.println("=========================");
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5.종료");
			System.out.println("=========================");
			System.out.println("선택 >");
			int selectNo = Integer.parseInt(scan.nextLine());

			switch (selectNo) {
			case 1:
				register();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				list();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;

			}

		}
	}

	public boolean checkId(String a) {
		boolean isText = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(a)) {
				isText = true;
				break;
			}
		}

		return isText;
	}

	public void register() {
		Friend fri = new Friend();
		Friend fri1 = new Univfriend();
		Friend fri2 = new ComFriend();

		System.out.print("등록하실 친구를 선택해주세요(1.친구 2.학교친구 3.회사친구)");
		int num = Integer.parseInt(scan.nextLine());
		if (num == 1) {
			System.out.print("이름을 입력해주세요");
			String name = scan.nextLine();
			System.out.print("전화번호를 입력해주세요");
			String phone = scan.nextLine();

			fri.setName(name);
			fri.setPhone(phone);
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = fri;
					System.out.println("등록되었습니다");
					break;
				}
			}
		} else if (num == 2) {
			if(fri1 instanceof Univfriend) {
				Univfriend uni = (Univfriend) fri1;
				System.out.print("이름을 입력해주세요");
				String name = scan.nextLine();
	
				System.out.print("전화번호를 입력해주세요");
				String phone = scan.nextLine();
	
				System.out.print("학교이름을 입력해주세요");
				String school = scan.nextLine();
	
				System.out.print("전공을 입력해주세요");
				String major = scan.nextLine();
			
				uni.setName(name);
				uni.setPhone(phone);
				uni.setUniv(school);
				uni.setMajor(major);
				
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = uni;
						System.out.println("등록되었습니다");
						break;
					}
				}
				
			}
		} else if (num == 3) {
			if(fri2 instanceof ComFriend) {
				ComFriend com1 = (ComFriend) fri2;
				System.out.print("이름을 입력해주세요");
				String name = scan.nextLine();
				
				System.out.print("전화번호를 입력해주세요");
				String phone = scan.nextLine();
				
				System.out.print("회사이름을 입력해주세요");
				String com = scan.nextLine();
				
				System.out.print("부서을 입력해주세요");
				String depart = scan.nextLine();
				
				com1.setName(name);
				com1.setPhone(phone);
				com1.setCompany(com);
				com1.setDepartment(depart);
				
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = fri2;
						System.out.println("등록되었습니다");
						break;
					}
				}
				
			}
		}
	}

	public void update() {
		System.out.print("수정하실 이름을 입력해주세요");
		String a = scan.nextLine();

		boolean istrue = checkId(a);
		if (!istrue) {
			System.out.println("없는 이름입니다");
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(a)) {
				if (friends[i] instanceof ComFriend) {
					ComFriend com = (ComFriend) friends[i];
					System.out.print("회사이름을 입력해주세요");
					com.setCompany(scan.nextLine());
					System.out.print("부서를 입력해주세요");
					com.setDepartment(scan.nextLine());
				} else if (friends[i] instanceof Univfriend) {
					Univfriend uni = (Univfriend) friends[i];
					System.out.print("학교이름을 입력해주세요");
					uni.setUniv(scan.nextLine());
					System.out.print("전공을 입력해주세요");
					uni.setMajor(scan.nextLine());
				} else {
					System.out.print("전화번호를 입력해주세요");
					friends[i].setPhone(scan.nextLine());

				}
			}
		}
	}

	public void delete() {
		System.out.print("삭제하실 이름을 입력해주세요");
		String a = scan.nextLine();

		boolean istrue = checkId(a);
		if (!istrue) {
			System.out.println("없는 이름입니다");
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(a)) {
				friends[i] = null;
			}
		}
	}

	public void list() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].showInfo());
			}
		}
	}

}
