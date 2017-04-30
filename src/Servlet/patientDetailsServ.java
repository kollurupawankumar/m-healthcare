package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MyBean;
import Implementation.MyImplementation;
import Interface.MyInterface;

/**
 * Servlet implementation class patientDetailsServ
 */
@WebServlet("/patientDetailsServ")
public class patientDetailsServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientDetailsServ() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String admission="";
		admission=request.getParameter("admis");
		 
		/*MyBean mb=new MyBean();
		mb.setAdmission(admission);
		MyInterface mi=new MyImplementation();
		int insert_status=mi.patientAdmission(mb);*/
		if(admission.equals("In-Patient")){
			response.sendRedirect("inpatient.jsp");}
			else if(admission.equals("Out-Patient")){
				response.sendRedirect("outpatient.jsp");
				}
			else{
				out.write("Select the patient Admission Section");
			}
	}

}

