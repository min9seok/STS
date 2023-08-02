package days15;

// 영업직 최종클래스
// 자식을 가질 수 없는 최종 클래스
public final class SalesMan extends Regular {
	
	// [ Object] 멤버들도 상속
	// 필드 - name, addr, tel, hiredate, basePay
	// 생성자는 상속되지 않음
	// 메서드 - @dispEmpinfo(), @toString(), getPay()
	private int sales; //판매량
	private int comm; //커미션
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}
	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}
	@Override
	public void dispEmpinfo() {		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급 :%d, 판매량 :%d, 커미션 :%d\n",
				this.getName(),this.getAddr(),this.getTel(),this.getHiredate(),this.getBasePay(),this.sales,this.comm);
	}

	@Override
	public int getPay() {
		return super.getPay() + this.sales * this.comm;
	}
	

}
//The type Child cannot subclass the final class SalesMan
//class Child extends SalesMan{}