
package Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

import Bean.MyBean;
import Connection.MysqlConnection;
import Interface.MyInterface;
public class MyImplementation implements MyInterface {
	private Connection conn=null;
	private PreparedStatement ps=null;
	private String query=null;
	private int primaryValue=0;
	public void connect(String query)
	{
		System.out.println("in-connection Query : "+query);
		conn=MysqlConnection.getConnection();
		try{
			ps=conn.prepareStatement(query);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
			
	public int patientRegisteration(MyBean mb) {
		// TODO Auto-generated method stub
	query="insert into patientregisteration values(?,?,?,?,?,?,?,?)";
		connect(query);
		int status=0;
		try{
		ps.setInt(1, primaryValue);	
			ps.setString(2, mb.getFullname());
			ps.setString(3, mb.getAge());
			ps.setString(4, mb.getAddress());
			ps.setString(5, mb.getContact());
			ps.setString(6, mb.getPassword());
			ps.setString(7, mb.getRegisterDate());
			ps.setString(8, mb.getPatientMail());
			status=ps.executeUpdate();
			
		}
		catch(SQLException s){
			status=0;
		}
		catch(Exception e){
			status=0;
		}
	
		return status;
	}

	@Override
	public boolean patientLogin(MyBean mb) {
		// TODO Auto-generated method stub
		query="select * from patientregisteration where Patient_Name='"+mb.getFullname()+"' and Password='"+mb.getPassword()+"'";
		connect(query);
		try{
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				String patientname=rs.getString(2);
				String password=rs.getString(6);
				if(patientname.trim().equals(mb.getFullname())&&(password.trim().equals(mb.getPassword()))){
					return true;
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public int bpPatientRegisteration(MyBean mb) {
		// TODO Auto-generated method stub
		query="INSERT INTO psmpa.bppatientregisteration VALUES(?,?,AES_ENCRYPT(?,'"+mb.getBpPatientName()+"'),AES_ENCRYPT(?,'"+mb.getBpPatientName()+"'),AES_ENCRYPT(?,'"+mb.getBpPatientName()+"'),AES_ENCRYPT(?,'"+mb.getBpPatientName()+"'),?);";
		connect(query);
		int status=0;
		try{
			ps.setInt(1, primaryValue);
			ps.setString(2, mb.getBpPatientName());
			ps.setString(3, mb.getBpRange());
			ps.setString(4, mb.getSugarLevel());
			ps.setString(5, mb.getBloodTest());
			ps.setString(6, mb.getUrineLevel());
			ps.setString(7, mb.getWeight());
			status=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int heartPatientRegisteration(MyBean mb) {
		// TODO Auto-generated method stub
		query="insert into heartpatientregisteration values(?,?,AES_ENCRYPT(?,'"+mb.getHeartPatientName()+"'),AES_ENCRYPT(?,'"+mb.getHeartPatientName()+"'),AES_ENCRYPT(?,'"+mb.getHeartPatientName()+"'));";
		connect(query);
		System.out.println("HeartInsertQuery="+query);
		int status=0;
		try{
			ps.setInt(1, primaryValue);
			ps.setString(2,mb.getHeartPatientName());
			ps.setString(3,mb.getHeartBPRange());
			ps.setString(4, mb.getPulseLevel());
			ps.setString(5, mb.getMedicinetaken());
			status=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int generalPatientRegisteration(MyBean mb) {
		// TODO Auto-generated method stub
		query="insert into generalpatientregisteration values(?,?,AES_ENCRYPT(?,'"+mb.getGeneralPatientName()+"'),AES_ENCRYPT(?,'"+mb.getGeneralPatientName()+"'),AES_ENCRYPT(?,'"+mb.getGeneralPatientName()+"'),?,AES_ENCRYPT(?,'"+mb.getGeneralPatientName()+"'));";
		connect(query);
		int status=0;
		try{
			ps.setInt(1, primaryValue);
			ps.setString(2, mb.getGeneralPatientName());
			ps.setString(3, mb.getGeneralBPRange());
			ps.setString(4, mb.getCold());
			ps.setString(5, mb.getFever());
			ps.setString(6, mb.getGeneralWeight());
			ps.setString(7, mb.getHeadAche());
			System.out.println("primary"+"Bp"+"Cold"+"fever"+"weight"+"headache="+primaryValue+mb.getGeneralPatientName()+mb.getGeneralBPRange()+mb.getGeneralWeight()+mb.getCold()+mb.getFever()+mb.getHeadAche());
			status=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public int outPatientRegisteration(MyBean mb) {
		// TODO Auto-generated method stub
		int status=0;
		query="insert into outpatientregisteration values(?,?,?,?,?,?)";
		connect(query);
		try
		{
			ps.setInt(1,primaryValue);
			ps.setString(2, mb.getOutpatientName());
			ps.setString(3, mb.getBedNo());
			ps.setString(4, mb.getAddress());
			ps.setString(5, mb.getPayment());
			ps.setString(6, mb.getPcontact());
			status=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public ArrayList allBPPatientName() {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		query="select distinct Sno,Patient_Name from bppatientregisteration";
		connect(query);
		System.out.println("bpname query="+query);
		try{
			ResultSet set=ps.executeQuery();
			while(set.next()){
			String Sno=set.getString(1).toString().trim();
			String patientName=set.getString(2).toString().trim();
			list.add(Sno);
			list.add(patientName);
			}
		}
		
		 catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}

	public ArrayList getBPFullDetails(String patientName)
	
	{
		//System.out.println("patientName="+patientName);
		ArrayList< String> list=new ArrayList<String>();
		query="select Patient_Name,AES_DECRYPT(Bp_Range, '"+patientName+"'),AES_DECRYPT(Sugar_Level, '"+patientName+"'),AES_DECRYPT(Blood_Test, '"+patientName+"'),AES_DECRYPT(Urine_Level, '"+patientName+"'),Weight from psmpa.bppatientregisteration where Patient_Name='"+patientName+"'";
		
		connect(query);
		System.out.println("fulldetails="+query);
	
		try {
			ResultSet rs=ps.executeQuery();
			System.out.println("All values resulset="+rs);
			while(rs.next()){
				String patientname=(rs.getString(1));
				String bpRange=rs.getString(2);
				String sugarlevel=rs.getString(3);
				String bloodTest=rs.getString(4);
				String urineLevel=rs.getString(5);
				String weight=rs.getString(6);
				 
				list.add(patientname);
				list.add(bpRange);
				list.add(sugarlevel);
				list.add(bloodTest);
				list.add(urineLevel);
				list.add(weight);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public ArrayList allgeneralPatientName() {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		query="select distinct Sno,Patient_Name from generalpatientregisteration";
		connect(query);
		System.out.println("generalname query="+query);
		try{
			ResultSet set=ps.executeQuery();
			while(set.next()){
			String Sno=set.getString(1).toString().trim();
			String patientName=set.getString(2).toString().trim();
			list.add(Sno);
			list.add(patientName);
			}
		}
		
		 catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList getgeneralFullDetails(String patientName) {
		// TODO Auto-generated method stub
		ArrayList< String> list=new ArrayList<String>();
		query="select Patient_Name,AES_DECRYPT(BP_Range, '"+patientName+"'),AES_DECRYPT(Cold, '"+patientName+"'),AES_DECRYPT(Fever, '"+patientName+"'),Weight,AES_DECRYPT(Headache, '"+patientName+"')from psmpa.generalpatientregisteration where Patient_Name='"+patientName+"'";
		System.out.println(query);
		connect(query);
		System.out.println("fulldetails="+query);
	
		try {
			ResultSet rs=ps.executeQuery();
			System.out.println("All values resulset="+rs);
			while(rs.next()){
				String patientname=rs.getString(1);
				String bpRange=rs.getString(2);
				String cold=rs.getString(3);
				String fever=rs.getString(4);
				String weight=rs.getString(5);
				String headache=rs.getString(6);
				 
				list.add(patientname);
				list.add(bpRange);
				list.add(cold);
				list.add(fever);
				list.add(weight);
				list.add(headache);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList allheartPatientName() {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		query="select distinct Sno,Patient_Name from heartpatientregisteration";
		connect(query);
		System.out.println("heartname query="+query);
		try{
			ResultSet set=ps.executeQuery();
			while(set.next()){
			String Sno=set.getString(1).toString().trim();
			String patientName=set.getString(2).toString().trim();
			list.add(Sno);
			list.add(patientName);
			}
		}
		
		 catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList getheartFullDetails(String patientName) {
		// TODO Auto-generated method stub
		ArrayList< String> list=new ArrayList<String>();
		query="select Patient_Name,AES_DECRYPT(BP_Range, '"+patientName+"'),AES_DECRYPT(Pulse_Level, '"+patientName+"'),AES_DECRYPT(Take_AnyMedicine, '"+patientName+"')from psmpa.heartpatientregisteration where Patient_Name='"+patientName+"'";		connect(query);
		System.out.println("fulldetails="+query);
	
		try {
			ResultSet rs=ps.executeQuery();
			System.out.println("All values resulset="+rs);
			while(rs.next()){
				String patientname=rs.getString(1);
				String bpRange=rs.getString(2);
				String pulseLevel=rs.getString(3);
				String medicine=rs.getString(4);
				
				 
				list.add(patientname);
				list.add(bpRange);
				list.add(pulseLevel);
				list.add(medicine);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
