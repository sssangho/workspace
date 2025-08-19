package com.du;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.du.dao.DeptDao;
import com.du.dao.EmpDao;
import com.du.dto.Dept;
import com.du.dto.Emp;

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
		
		if (com.equals("/") || com.equals("/dept")) {
			DeptDao dao = new DeptDao();
			List<Dept> list = dao.selectList();
			request.setAttribute("list", list);
			request.setAttribute("isUpdate", "no");  // update or insert 구분
			view = "dept.jsp";
		} else if (com.equals("/delete")) {
			String deptno = request.getParameter("deptno");
			DeptDao dao = new DeptDao();
			dao.delete(deptno);
			view = "redirect:dept";
		} else if (com.equals("/insert")) {
			request.setCharacterEncoding("utf-8");
			String isUpdate = request.getParameter("isUpdate");
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			Dept dept = new Dept(deptno, dname, loc);
			DeptDao dao = new DeptDao();
			if (isUpdate.equals("no")) {
				dao.insert(dept);
			} else {
				dao.update(dept);
			}
			view="redirect:dept";
		} else if (com.equals("/updateForm")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			DeptDao dao = new DeptDao();
			Dept dept = dao.selectOne(deptno);
			request.setAttribute("dto", dept);
			List<Dept> list = dao.selectList();
			request.setAttribute("list", list);
			request.setAttribute("isUpdate", "yes");
			view = "dept.jsp";
//-------------------------------------------------------------------------------------
		} else if (com.equals("/emp") ) {
			EmpDao dao = new EmpDao();
			List<Emp> list = dao.selectList();
			request.setAttribute("list", list);
			request.setAttribute("empisUpdate", "no");  // update or insert 구분
			view = "emp.jsp";
		} else if (com.equals("/empdelete")) {
			String empno = request.getParameter("empno");
			EmpDao dao = new EmpDao();
			dao.delete(empno);
			view = "redirect:emp";
		} else if (com.equals("/empinsert")) {
			request.setCharacterEncoding("utf-8");
			String empisUpdate = request.getParameter("empisUpdate");
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String mgr = request.getParameter("mgr");
			String hiredate = request.getParameter("hiredate");
			int sal = Integer.parseInt(request.getParameter("sal"));
			String comm = request.getParameter("comm");
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			EmpDao dao = new EmpDao();
			if (empisUpdate.equals("no")) {
				dao.insert(emp);
			} else {
				dao.update(emp);
			}
			view="redirect:emp";
		} else if (com.equals("/empupdateForm")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDao dao = new EmpDao();
			Emp emp = dao.selectOne(empno);
			request.setAttribute("dto", emp);
			List<Emp> list = dao.selectList();
			request.setAttribute("list", list);
			request.setAttribute("empisUpdate", "yes");
			view = "emp.jsp";
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
