package days13;

// 멤버 + 접근지정자 설명
// 시간 + 속성, 기능을 구현한 클래스
public class Time {
	
	// 필드
	public int hour;
	int minute;
	protected int second;
	private int milisecond; // 1000분의1초
	
	public int nano;          // 1/10^9초
	
	public void printTime() {
		milisecond = 100;
	}	
}//class
