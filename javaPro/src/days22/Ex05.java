package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05 {

	public static void main(String[] args) {
//		5. 이름, 나이 필드를 가진 Person 클래스를 선언하고
//		   ArrayList 컬렉션 클래스에  Person 객체를 요소로 추가하고 
//		   이름으로 오름차순 정렬해서    출력하는 코딩을 하세요 ..
		
		ArrayList list = new ArrayList();
		list.add(new Person("박정호",23));
		list.add(new Person("김성준",21));
		list.add(new Person("주강민",29));
		list.add(new Person("이경서",20));
		list.add(new Person("신기범",30));
		
		System.out.println(list);
		
		list.sort( new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				String p1Name = p1.getName();
				String p2Name = p2.getName();
				return p1Name.compareTo(p2Name);
			}
		});
		
		Iterator ir =  list.iterator();
		while (ir.hasNext()) {
			Person p = (Person) ir.next();
			System.out.println(p);
		}
		
		
	}//main
}//class
class Person{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	
}