package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MyBean;
import Implementation.MyImplementation;
import Interface.MyInterface;

/**
 * Servlet implementation class OutPatientServlet
 */
@WebServlet("/OutPatientServlet")
public class OutPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutPatientServlet() {
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
		String outpatientName=request.getParameter("name");
		String bedNo=request.getParameter("bed");
		String homeAddress=request.getParameter("address");
		String payment=request.getParameter("pay");
		String contact=request.getParameter("cont");
		
		MyBean mb=new MyBean();
		mb.setOutpatientName(outpatientName);
		mb.setBedNo(bedNo);
		mb.setHomeAddress(homeAddress);
		mb.setPayment(payment);
		mb.setPcontact(contact);
		MyInterface mi=new MyImplementation();
		int insert_status=mi.outPatientRegisteration(mb);
		if(insert_status==1){
			
			response.sendRedirect("payments.jsp");

		}
		else{
			response.sendRedirect("outpatient.jsp");
		}
		
		
	}

}
