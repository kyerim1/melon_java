package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO {
	private Connection conn; // 데이터베이스 접속정보 저장
	private Statement st; // SQL명령어 전달과 결과 받기
	private PreparedStatement pt; // SQL명령어 전달과 결과 받기
	private ResultSet rs;// 데이터 조회 결과 저장
	
	public BoardDAO() {
		DriverLoad(); // 데이터베이스 드라이버 로드
		Connect(); // 데이터베이스 접속
	}
	
	
	private void DriverLoad() { // 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패 ");
		}
		
	}
	private void Connect() { // 데이터베이스 접속
		String username = "melon";
		String password = "1234";
		String url="jdbc:mysql://localhost:3306/melon";
		
		try {
			conn = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.out.println("접속 실패");
		}
	}
	
}



/*
	Connection , Statement 또는 PreparedStatement , ResulSet
	참조변수 필요
	
	1. 데이터베이스와 연결하기위한 드라이버 로드
	   (mysql 5버전 이후 - com.mysql.cj.jdbc.Driver 
	    5번전 이하 - com.mysql.jdbc.Driver
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    
	2. 데이터베이스에 접속 하기
	   데이터베이스 계정명, 비밀번호, 주소
	   conn = DriverManager.getConnection( 주소, 계정명, 비밀번호 );
	   
	    접속을 시도한 결과를 Connection의 참조변수에 저장
	
	3. conn을 통해서 Statement 또는 PreparedStatement의 객체 생성하여
	   SQL명령어 보내기
 */










