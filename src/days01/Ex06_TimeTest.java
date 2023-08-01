package days01;

import days13.Time;

public class Ex06_TimeTest {

	public static void main(String[] args) {
		//days13.Time + days01.Ex07_TimeTest
		//패키지 외부,              내부X
		Time t = new Time();
		t.hour=2; // public  패키지 내외부 어디서든 접근 가능
		// X t.second=5; // protected 패키지 내부 또는 상속관계 
		// X t.minut; default
		// X t.milisecond private
	}

}
