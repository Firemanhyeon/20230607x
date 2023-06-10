package com.yedam.abstracts;

// mysql : dbms 기능구현
// oracle : dmbs 기능구현
public class JdbcExe {

	public static void main(String[] args) {
		Dao dao = new OracleDao();
//		OracleDao odao = new OracleDao(); // 상속의 관계가 아닐 경우 -> 메소드들을 새로정의하고 기존코드들도 변경해줘야함
		
		dao.start(); // odao.begin();
		dao.add();	// odao.register();
		dao.modify(); // odao.modify();
		dao.remove(); // odao.delete();
		dao.stop(); // odao.end();
	}

}
