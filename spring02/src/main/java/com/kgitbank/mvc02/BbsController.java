package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BbsController {

	//�̱��� ������ ����
	@Autowired
	BbsDAO dao;
	
	
	@RequestMapping("insert2")
	public void insert2(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert ��û��");
		System.out.println("�Է��� id: "+id);
		System.out.println("�Է��� title: "+title);
		System.out.println("�Է��� content: "+content);
		System.out.println("�Է��� write: "+writer);
		dao.insert2(id, title, content, writer);
	}
	
	@RequestMapping("delete2")
	public void delete2(String id) throws Exception {
		System.out.println("delete ��û��");
		System.out.println(id+"Ż�� ��");
		dao.delete2(id);
	}
	
	@RequestMapping("select2")
	public void select2(String id, Model model) throws Exception {
		System.out.println("select ��û��");
		BbsDTO dto4 = dao.select2(id);
		model.addAttribute("dto4", dto4);
	}
	
	
}
