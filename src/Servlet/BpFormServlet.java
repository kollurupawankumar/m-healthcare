package Servlet;

import java.io.IOException;
import java.sql.Array;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MyBean;
import Implementation.MyImplementation;
import Interface.MyInterface;

/**
 * Servlet implementation class BpFormServlelt
 */
@WebServlet("/BpFormServlet")
public class BpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BpFormServlet() {
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
		String bpPatientName=request.getParameter("name");
		String bpRange=request.getParameter("bp");
		String sugarLevel=request.getParameter("sugar");
		String bloodTest=request.getParameter("blood");
		String urineLevel=request.getParameter("urine");
		String weight=request.getParameter("wgt");
						
		MyBean mb=new MyBean();
		mb.setBpPatientName(bpPatientName);
		mb.setBpRange(bpRange);
		mb.setSugarLevel(sugarLevel);
		mb.setBloodTest(bloodTest);
		mb.setUrineLevel(urineLevel);
		mb.setWeight(weight);
		
		MyInterface mi=new MyImplementation();
		int insert_status=mi.bpPatientRegisteration(mb);
		if(insert_status==1){
			response.sendRedirect("registered.jsp");			
		}else{
			response.sendRedirect("bpform.jsp");
		}
	}

}
