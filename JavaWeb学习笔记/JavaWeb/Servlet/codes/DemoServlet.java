package com.blsh.china;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 获取Servlet的初始化信息
 * */
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		ServletContext context = this.getServletContext();
		Enumeration enumeration = context.getInitParameterNames();
		
		while (enumeration.hasMoreElements()) {
			String name = (String) enumeration.nextElement();
			String value = context.getInitParameter(name);
			System.out.println(name + ":" +value);
		}
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
		return;
	}
}
