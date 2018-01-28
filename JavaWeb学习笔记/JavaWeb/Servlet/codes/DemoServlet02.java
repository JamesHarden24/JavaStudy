package com.blsh.china;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext���������ļ�
 * */
public class DemoServlet02 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/* ����Properties�ļ� */
		Properties prop = new Properties();
		prop.load(new FileReader(""));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("passwd"));
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		return;
	}
}
