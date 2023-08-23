package days27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		String pathname = ".\\src\\days27\\Child.ser";
		try( FileOutputStream out = new FileOutputStream(pathname);
			 ObjectOutputStream oos = new ObjectOutputStream(out)) {
			// NotSerializableException 직렬화할 수 없는 예외
			oos.writeObject(c);			
			
			oos.flush();
			
			System.out.println("> c 객체를 직렬화 시켜서 oos 파일로 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		

	}//main

}//class
// 2. 부모클래스 직렬화 X , 자식클래스 직렬화 
class Parent {
	String name; // 직렬화 대상에서 제외 null
}
class Child extends Parent implements Serializable {
	int age;
	// 개발자가 직접 무모의 멤버를 직렬화 대상에 추가되도록 구현
	private void writeObjec(ObjectOutputStream out) throws IOException{
		out.writeUTF(name); // 개발자가 직접 직렬화 대상에 포함
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
		name = in.readUTF();
		in.defaultReadObject();
	}
}

// 1. 부모를 직렬화할 수 있는 클래스로 선언
//class Parent implements Serializable{
//	String name;
//}
//class Child extends Parent {
//	int age;
//}