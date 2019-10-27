package com.kgitbank.mvc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	public void insert2(String id, String title, String content, String writer) throws Exception {
	
		//�ڵ� import ctrl + shift + o
		//Model(M)
		//1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		//View(V)
		System.out.println("1. ����̹� ���� ����!");
		
		//2. DB ����
		String url = "jdbc:mysql://localhost:3306/spring"; //������ DB
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB ���� ����!");
		
		//3. SQL ����
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.println("3. SQL ���� ����!");
		
		//4. SQL ����
		ps.executeUpdate();		
		System.out.println("4. SQL ���� ����!");
	}
	
	public void delete2(String id) throws Exception {
		
		//�ڵ� import ctrl + shift + o
		//Model(M)
		//1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		//View(V)
		System.out.println("1. ����̹� ���� ����!");
		
		//2. DB ����
		String url = "jdbc:mysql://localhost:3306/spring"; //������ DB
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB ���� ����!");
		
		//3. SQL ����
		String sql = "delete from bbs where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!");
		
		//4. SQL ����
		ps.executeUpdate();		
		System.out.println("4. SQL ���� ����!");
	}
	
public BbsDTO select2(String id) throws Exception {
		
		//�ڵ� import ctrl + shift + o
		//Model(M)
		//1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		//View(V)
		System.out.println("1. ����̹� ���� ����!");
		
		//2. DB ����
		String url = "jdbc:mysql://localhost:3306/spring"; //������ DB
		String user = "root"; //id
		String password = "1234"; //pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB ���� ����!");
		
		//3. SQL ����
		String sql = "select * from bbs where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!");
		
		//4. SQL ����
		ResultSet rs = ps.executeQuery();
		BbsDTO dto3 = null;
		if(rs.next()) {
			String gid = rs.getString(1);
			String gtitle = rs.getString(2);
			String gcontent = rs.getString(3);
			String gwriter = rs.getString(4);
			
			
			dto3 = new BbsDTO();
			dto3.setId(gid);
			dto3.setTitle(gtitle);
			dto3.setContent(gcontent);
			dto3.setWriter(gwriter);
			
			
		}
		
		
		System.out.println("4. SQL ���� ����!");
		return dto3;
	}
}
