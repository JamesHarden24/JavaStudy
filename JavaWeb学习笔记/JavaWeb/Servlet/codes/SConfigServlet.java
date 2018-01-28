package com.blsh.china;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SConfigServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		ServletConfig config = this.getServletConfig();
		
		//获取ServletContext对象
		ServletContext context = config.getServletContext();
		context.setAttribute("James", "Harden");
		String v = (String) context.getAttribute("James");
		context.removeAttribute("James");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
		return;
	}
}
