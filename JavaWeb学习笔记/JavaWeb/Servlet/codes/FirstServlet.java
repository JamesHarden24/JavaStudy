package com.blsh;

import java.io.*;
import javax.servlet.*;

public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, java.io.IOException{
		res.getWriter().write("Hello Servlet");
	}
}