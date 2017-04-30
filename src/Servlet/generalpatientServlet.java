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
 * Servlet implementation class generalPatientServlet
 */
@WebServlet("/generalpatientServlet")
public class generalpatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public generalpatientServlet() {
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
		String generalPatientName=request.getParameter("name");
		String bP=request.getParameter("bp");
		String fever=request.getParameter("fever");
		String cold=request.getParameter("cold");
		String weight=request.getParameter("weight");
		String headache=request.getParameter("head");
		
		MyBean mb=new MyBean();
		mb.setGeneralPatientName(generalPatientName);
		mb.setGeneralBPRange(bP);
		mb.setFever(fever);
		mb.setCold(cold);
		mb.setGeneralWeight(weight);
		mb.setHeadAche(headache);
		
		MyInterface mi=new MyImplementation();
		int insert_status=mi.generalPatientRegisteration(mb);
		if(insert_status==1){
			response.sendRedirect("registered.jsp");
			}else{
				response.sendRedirect("generalPatient.jsp");
			}
			
	}

}
