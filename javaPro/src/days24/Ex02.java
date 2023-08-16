package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex02 {

	public static void main(String[] args) {
		// Properties 컬렉션클래스
		// setProperty(), getProperty()
//		String userDit = System.getProperty("user.dir");
//		System.out.println(userDit);
		
		Properties sysProps = System.getProperties();
		Enumeration<Object> en = sysProps.keys();
		while (en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = System.getProperty(key);
			System.out.printf("%s : %s\n",key,value);
		}
		
		
	}//main

}//class
