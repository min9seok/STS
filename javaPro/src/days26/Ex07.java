package days26;

import java.io.FileOutputStream;
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
public class Ex07 {

	public static void main(String[] args) {
		
		UserInfo u1 = new UserInfo("김호중","1234",25);
		UserInfo u2 = new UserInfo("이지현","4321",23);
		
		ArrayList<UserInfo> list = new ArrayList();
		list.add(u1);
		list.add(u2);
		
		String pathname = ".\\src\\days26\\UserInfo.ser";
		try( FileOutputStream out = new FileOutputStream(pathname);
			 ObjectOutputStream oos = new ObjectOutputStream(out)) {
			// NotSerializableException 직렬화할 수 없는 예외
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			
			System.out.println("> u1,u2,list 객체를 직렬화 시켜서 oos 파일로 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class
// The serializable class UserInfo does not declare a static final serialVersionUID field of type long
class UserInfo implements Serializable{

	private static final long serialVersionUID = -4461614692108077735L;
	
	String name;
	transient String password; // 직렬화 대상에서 제외
	int age;
	public UserInfo() {
		this("UnKnown","1111",0);
	}
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}