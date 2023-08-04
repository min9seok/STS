package util;

public class Draw2D {
	// 2D 그리기 작업할 수 있는 모든 기능들을 구현한 클래스
	// 함수 선언 3가지
	// 1) 기능 : 선 긋기 drawLine
	// 2) 매개변수 : X
	// 3) 리턴값(리턴자료형) : X void
	public static void drawLine() { //Ex08_02.drawLine(); 함수 선언된 java파일명을 쓰면 다른곳에서도 사용가능
		// 구분선(100줄)
		System.out.println("--------------");
	}
	//	Duplicate method drawLine() in type Ex08_02
	public static void drawLine(int n) { // 매개변수가 다르면 같은 함수명도 다른 자료 인식
		// 구분선(100줄)
		for (int i = 1; i < n; i++) {			
			System.out.print("-");
		} // for
		System.out.println();
	}
	public static void drawLine(int n, char style) { // 매개변수가 다르면 같은 함수명도 다른 자료 인식
		// 구분선(100줄)
		for (int i = 1; i < n; i++) {			
			System.out.print(style);
		} // for
		System.out.println();
	}
}
