package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.MyBean;
import Implementation.MyImplementation;
import Interface.MyInterface;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String patientname=request.getParameter("name");
		String password=request.getParameter("passw");
		
		
		MyBean mb=new MyBean();
		mb.setFullname(patientname);
		mb.setPassword(password);
		
		MyInterface mi=new MyImplementation();
		boolean status=mi.patientLogin(mb);
		if(status){
			HttpSession session=request.getSession();
			session.setAttribute("Patient_Name", patientname);
			
			response.sendRedirect("patientAdmission.jsp");
		}
		else{
			response.sendRedirect("patientLogin.jsp");
		}
	}

}
