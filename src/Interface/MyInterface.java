package Interface;

import java.util.ArrayList;

import Bean.MyBean;

public interface MyInterface  {
public int patientRegisteration(MyBean mb);
public boolean patientLogin(MyBean mb);
public int bpPatientRegisteration(MyBean mb); 
public int heartPatientRegisteration(MyBean mb);
public int generalPatientRegisteration(MyBean mb);
public int outPatientRegisteration(MyBean mb);
public ArrayList allBPPatientName();
public ArrayList getBPFullDetails(String patientName);
public ArrayList allgeneralPatientName();
public ArrayList getgeneralFullDetails(String patientName);
public ArrayList allheartPatientName();
public ArrayList getheartFullDetails(String patientName);

}
