package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MyBean;
import Implementation.MyImplementation;
import Interface.MyInterface;

/**
 * Servlet implementation class heartPatientServlet
 */
@WebServlet("/heartPatientServlet")
public class heartPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public heartPatientServlet() {
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
		String heartPatientName=request.getParameter("name");
		String heartbpRange=request.getParameter("bp");
		String pulseRange=request.getParameter("pulse");
		String medicine=request.getParameter("med");
		
		MyBean mb=new MyBean();
		mb.setHeartPatientName(heartPatientName);
		mb.setHeartBPRange(heartbpRange);
		mb.setPulseLevel(pulseRange);
		mb.setMedicinetaken(medicine);
		
		MyInterface mi=new MyImplementation();
		int insert_status=mi.heartPatientRegisteration(mb);
		if(insert_status==1){
			response.sendRedirect("registered.jsp");
		}else{
			response.sendRedirect("heartPatient.jsp");
			
		}
	}

}
