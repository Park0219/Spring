package com.kgitbank.mvc05;

import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookMarkDAO_old {

	
	public void insert(BookMarkDTO dto) throws Exception { //���ɽ��� �ڵ�, �ٿ��ɽ��� ��������ȯ
		// 1. DB ����̹�(Ŀ���� ����) -> pom.xml
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ����");
		
		// 2. DB ����(DB�ּ�(url), id, pw)
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";		
		Connection conn = DriverManager.getConnection(url,user,password);
		System.out.println("2. DB ���� ����");
		
		// 3. sql�� ����
		String sql = "insert into bookmark values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getSite());
		System.out.println("3. sql�� ���� ����");
		
		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. sql�� ���� ����");
		
		// 5. �˻��� ��쿡�� ���� ������ ó��
		
		
	}

}
