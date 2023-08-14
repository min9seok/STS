package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// Set LinkedHashSet 컬렉션 클래스
		// 중복허용 X 순서 유지
		
		// 주민등록번호가 같으면 같은 객체 중복 X
		Set<Person> s = new LinkedHashSet<Person>();
		s.add( new Person("123456-1234567","김호영",23));
		s.add( new Person("234567-2345678","박민석",25));
		s.add( new Person("345678-3456789","박정호",28));

		System.out.println(s.size());

		s.add( new Person("234567-2345678","박민석",35));		
		
		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p);
		}
	}//main

}//class
class Person{
	String rrn;
	String name;
	int age;
	public Person() {
		super();		
	}
	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}
	// hashcode() rrn 체크 오버라이딩
	// equals() rrn 체크 오버라이딩
	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person ) {
			Person p = (Person) obj;			
			return this.rrn.equals(p.rrn);			
		}
		return false;
	}
	
	
	
}