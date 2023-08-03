package days02;
/**
 * @author minseok
 * @date 2023. 7. 14. - 오전 10:21:23
 * @subject 지역변수( local variable ) 시험 1번문제
 * @content 
 */
public class Ex03 {
	
	public static void main(String[] args) {
		//String , int ,double
		//한 문자를 저장하는 자료형 : char 
		//자바에서 문자를 나타낼 때는 '한문자'
		//char grade = 'A';
		//System.out.printf("등급 : '%c'",grade);
		//코드영역(블럭)
		//{} 영역(범위) 연산자
		{
			char grade = 'A';
			System.out.printf("등급 : '%c'",grade);	
		}
		// grade cannot be resolved to a variable
		//System.out.printf("등급 : '%c'",grade);

		
	}//main
}//class
