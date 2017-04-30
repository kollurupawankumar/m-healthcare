package Servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {
public static String readFileuser(String mailidlocation){
	try {
		FileInputStream fin=new FileInputStream(new File(mailidlocation+"m-healthcare\\WebContent\\admin\\user.txt"));
	byte[] b=new byte[fin.available()]; 
	mailidlocation=new String(b);
	mailidlocation=mailidlocation.trim();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return mailidlocation;
	
}
public static String readFilepass(String mailidlocation){
	try {
		FileInputStream fin=new FileInputStream(new File(mailidlocation+"m-healthcare\\WebContent\\admin\\pass.txt"));
	byte[] b=new byte[fin.available()]; 
	mailidlocation=new String(b);
	mailidlocation=mailidlocation.trim();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return mailidlocation;
	
}
}
