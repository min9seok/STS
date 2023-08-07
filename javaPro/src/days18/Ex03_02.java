package days18;

public class Ex03_02 {

	public static void main(String[] args) {
		//주민등록번호가 같으면 동일한 사람(객체)이다.
		Person p1 = new Person("111", "홍길동");
		Person p2 = new Person("111", "홍길둥");
		
		// 3) Object.toString()
		// days18.Person@be11
		// 패키지명.클래스명@해시코드의 16진수값
		System.out.println(p1.toString()); // Parson [rrn=111, name=홍길동]  
		System.out.println(p2.toString());
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
//		Person p2 = null;
		// Object -> equals() 메서드를 오버라이딩
//		System.out.println(p1.equals(p2)); //false
		
		
		

	}//main

}//class

// Person 클래스의 객체가 복제(clone) 되도록 코딩.
class Person implements Cloneable{
	String rrn;
	@Override
	public String toString() {
//		return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Parson [rrn=%s, name=%s]", this.rrn,this.name);
	}
	String name;
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}
//	                 p1.equals(p2)  업캐스팅, 매개변수 다형성
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj; // 다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}
	@Override
	public int hashCode() {		
		return this.rrn.hashCode();
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {		
////		return super.clone(); // 밑 코딩 줄인 것
//		Object obj =null;
//		obj = super.clone();
//		return obj;
//	}
	// 오버라이딩 조건(주의사항)
	// JDK1.5 공변반환타입(convariant return type) 추가
	// - 오버라이딩 할때 조상 메서드의 반환타입을 자식클래스 타입으로 변경이 가능하다.
	@Override
	protected Person clone() {		
//		return super.clone(); // 밑 코딩 줄인 것
		Person p =null;
		try {
			p = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
			return p;
	}

	
	
}