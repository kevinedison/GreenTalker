package com.needle.greentalker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class ConnectWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	public ConnectWorldServlet() {
		super();
	}

	/**
	 * 处理http get请求
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//ConnectWorld connectWorld = new ConnectWorld(request);
		//String result = connectWorld.execute();
		//response.getOutputStream().write(result.getBytes());
        PrintWriter out = response.getWriter();
		out.write("hello，test123");
	}

	/**
	 * 处理http post请求
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ConnectWorld connectWorld = new ConnectWorld(request);
		String result = connectWorld.execute();
		response.getOutputStream().write(result.getBytes());
	}

}
