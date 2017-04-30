package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class patientRegServler
 */
@WebServlet("/patientRegServlet")
public class patientRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientRegServlet() {
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
		String name=request.getParameter("name");
		String regdate=request.getParameter("date");
		String gender=request.getParameter("Gender");
		String fullname=gender+"."+name;
		System.out.println("fullname="+fullname);
		String address=request.getParameter("address");
		String contact=request.getParameter("cont");
		String mailid=request.getParameter("mail");
		String password=request.getParameter("passw");
		String age=request.getParameter("age");
		String diseasetype=request.getParameter("disease");
		int insert_status=0;
		
		MyBean bean=new MyBean();
		bean.setName(name);
		bean.setRegisterDate(regdate);
		bean.setGender(gender);
		bean.setAge(age);
		bean.setAddress(address);
		bean.setContact(contact);
		bean.setPatientMail(mailid);
		bean.setPassword(password);
		bean.setFullname(fullname);
		bean.setDiseasetype(diseasetype);
		
		MyInterface mi=new MyImplementation();
		insert_status=mi.patientRegisteration(bean);
		
		if(insert_status==1){
			HttpSession session=request.getSession();
			session.setAttribute("pName",fullname );
			session.setAttribute("PatientMail", mailid);
			 String path=request.getRealPath("/");
				path=path.substring(0,path.indexOf("."));
			new sendMailpassword().sendMail(password, mailid, path);
			RequestDispatcher rd=request.getRequestDispatcher("patientLogin.jsp");
			rd.forward(request, response);
		}else
		{
			response.sendRedirect("patientRegisteration.jsp");
		}
	}

}
