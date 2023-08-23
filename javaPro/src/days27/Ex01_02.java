package days27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author user
 * 직렬화 객체 > 스트림 
 * 역직렬화 스트림 > 객체
 * 객체를 직렬화해서 읽/쓰기 하는 바이트 스트림
 * Object InputStream output
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
				
		String pathname = ".\\src\\days27\\Child.ser";
		try( FileInputStream in = new FileInputStream(pathname);
			 ObjectInputStream ois = new ObjectInputStream(in)) {		
			
			// ois 스트림 > Child c 객체 ( 역직렬화)
			Child c = (Child) ois.readObject();
			
			System.out.println(c.name);			
			System.out.println(c.age);			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class