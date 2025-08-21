package com.du;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		

		if (com.equals("/") || com.equals("/main")) {
			String email = request.getParameter("email");
			String remember = request.getParameter("remember");
//			System.out.println(remember);
			
			if ("on".equals(remember)) {
				// 쿠키에 저장
				Cookie ck = new Cookie("email", email);
				ck.setMaxAge(-1); // 브라우저가 닫을 때까지
//				ck.setMaxAge(30); // 30초후 쿠키 지우기
				response.addCookie(ck);
			} else {
				// 쿠키를 삭제
				Cookie ck = new Cookie("email", null);
				ck.setMaxAge(0);           
			    response.addCookie(ck);
			}
			view = "redirect:remember.jsp";
			
		}
		
		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}