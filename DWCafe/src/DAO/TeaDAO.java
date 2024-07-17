package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer , Tea> findAll( String table){
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql ="select * from tea";
		
		try {
			pt = conn.prepareStatement(sql);
			rs=pt.executeQuery();
			while(rs.next()) {
				data.put( rs.getInt("tea_id") ,
			new Tea(rs.getString(2) , rs.getInt(3)  )			
						);
			}
			
		}catch(SQLException e) {
			System.out.println("tea���̺� ��ȸ����");
		}
		
		
		return data;
	}
}








