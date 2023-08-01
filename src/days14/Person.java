package days14;


public class Person {

	// 필드
	private String name;
	private int age;
	private boolean gender;
	
	// [ Alt + Shfit + S ] context menu
	public Person() {}	
	public Person(boolean b) {
		gender = b;
	}
	// getter ,setter 선언
	public void setAge(int n) {
		if(0<=n && n<= 130) {
			age = n;		
		}else {
			//강제로 예외 발생
			// [예외처리]throw - 강제로 예외 던지다
			throw new RuntimeException("Person.age 0~130 실행 오류!!!");
		}
	
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//set 주석처리시 gender 필드는 읽기전용으로만 사용
	public boolean isGender() {
		return gender;
	}
//	public void setGender(boolean gender) {
//		this.gender = gender;
//	}
	
	
	
	
}// class
