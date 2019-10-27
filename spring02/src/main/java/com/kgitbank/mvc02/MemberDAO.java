package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	public void insert(String id, String pw, String name, String tel) throws Exception {
	
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
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL ���� ����!");
		
		//4. SQL ����
		ps.executeUpdate();		
		System.out.println("4. SQL ���� ����!");
	}
	
	
	public void delete(String id) throws Exception {
		
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
		String sql = "delete from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!");
		
		//4. SQL ����
		ps.executeUpdate();		
		System.out.println("4. SQL ���� ����!");
	}
	
	
	public MemberDTO select(String id) throws Exception {
		
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
		String sql = "select * from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL ���� ����!");
		
		//4. SQL ����
		ResultSet rs = ps.executeQuery(); //read(select)
		MemberDTO dto2 = null;
		if(rs.next()) { //�˻������ �ִ��� üũ: true
			String gid = rs.getString(1); // ���ڴ� �÷��� ��ȣ
			String gpw = rs.getString(2);
			String gname = rs.getString(3);
			String gtel = rs.getString(4);
			
			System.out.println(gid);
			System.out.println(gpw);
			System.out.println(gname);
			System.out.println(gtel);
			dto2 = new MemberDTO();
			dto2.setId(gid);
			dto2.setPw(gpw);
			dto2.setName(gname);
			dto2.setTel(gtel);
			
		}
		System.out.println("4. SQL ���� ����!");
		return dto2;
	}
	
}
