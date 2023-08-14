package days23;

import java.io.FileWriter;
import java.util.Properties;

public class Ex10 {

	public static void main(String[] args) {
		/*
		Properties 컬렉션 클래스 
        == Hashtable 컬렉션 클래스
        - Map
        - Hashtable<String,String> == Properties
        - key,value : String
        
		- 환경설정 값들을 Properties 클래스 사용해서 쓰기,읽기 작업
		 */
		// 오라클 + java 연동 
		  String className = "oracle.jdbc.driver.OracleDriver";            
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
	      String user = "scott";                                                                   
	      String password = "tiger";      

	      Properties p = new Properties();
	      p.setProperty("className", className);
	      p.setProperty("url",url);
	      p.setProperty("user", user);
	      p.setProperty("password", password);
	      
//	      String value = p.getProperty("password");
//	      System.out.println(value);
	      
	      // ???.properties 확장자
	      String fileName = ".\\src\\com\\util\\jdbc.properties";
	      String comments = "jdbc configuration";
	      try (FileWriter writer = new FileWriter(fileName) ) {	    	  
			p.store(writer,comments);
			System.out.println(" Save End. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	      
	      
	}//main

}//class
