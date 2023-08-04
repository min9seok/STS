package days08;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오후 12:15:40
 * @subject 재귀함수( recuresive function)
 * @content 순환 , 되풀이되는, 재귀하는
 *                함수 안에서 자기 자시늘 다시 호출하는 함수 '재귀[호출]함수'
 */
public class Ex06 {

	public static void main(String[] args) {
		disp(); // 함수 호출

	}//main

//	재귀함수
	public static void disp() {
		System.out.println("> disp() 호출됨...");
		
//		disp();
	}

}
