package com.kgitbank.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookMarkDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BookMarkDTO dto) throws Exception { //���ɽ��� �ڵ�, �ٿ��ɽ��� ��������ȯ
		
		my.insert("book.insert", dto);
		
	}
	
	public void update(BookMarkDTO dto) {
		
		my.update("book.update",dto);
	}

	public void delete(BookMarkDTO dto) {
		
		my.delete("book.delete",dto);
	}
	
	public BookMarkDTO selectOne(BookMarkDTO dto) {
		
		return my.selectOne("book.selectOne",dto);
	}
	
	public List<BookMarkDTO> selectAll() {
		
		return my.selectList("book.selectAll");
	}
	
}
