package DAO;

import java.sql.SQLException;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect {  // 회원 관련 데이터베이스 작업 하는 클래스
	
	
	public void save(MemberDTO member) { // 회원가입 내용 member 테이블에 저장
		
		String sql="insert into member(user_id, user_password, user_email, user_name) "
				+" values(?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate(); 
			
		}catch(SQLException e) {
			System.out.println("회원가입 member테이블 저장 실패");
			e.printStackTrace();
		}
	}

}



