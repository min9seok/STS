package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 4:27:42
 * @subject 형변환 
 * @content
 */
public class Ex16 {
	public static void main(String[] args) {
		//1. 자동 형변환 - 2가지
		int i = 10;
		long l = i;
		float f =l;
		System.out.println(f);
		
		long L = l + i; // long + int = long
		System.out.println(L);			
		//2. 강제 형변환
		// () 최우선 연산자 ,cast 연산자 (변환하고자하는 타입)
		int a = 20;
		int b = 3;		
		System.out.println((double)a/b);
		
		
		
	}//main
}//class
