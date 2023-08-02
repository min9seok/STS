package days15;

// 정규직 사원 클래스
public class Regular extends Employee {
	// [ Object] 멤버들도 상속
	// 필드 - name, addr, tel, hiredate
	// 생성자 X
	// 메서드 - dispEmpinfo(), @toString()
	private int basePay; // 기본급

	// 생성자
	public Regular() {
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}
	
	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		//The field Employee.name is not visible
//		this.name = name; X
//		this.setName(name); O
//		super();  부모의 디폴트 생성자 호출
		super(name,addr,tel,hiredate); // 부모 상속된 필드 초기화
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");	
	}
	
	public int getBasePay() {
		return basePay;
	}
	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	@Override
	public void dispEmpinfo() {		
//		super.dispEmpinfo(); //부모의 멤버들을 가리킬때의 super
//		System.out.printf(", 기본급 :%d\n",this.basePay);
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급 :%d\n",this.getName(),this.getAddr(),this.getTel(),this.getHiredate(),this.basePay);
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", 기본급 :%d\n",this.basePay);
	}
	
	public int getPay() {
		return this.basePay;
	}
	
		
	
	
}//class	
