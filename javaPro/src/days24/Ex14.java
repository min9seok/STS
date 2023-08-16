package days24;

public class Ex14 {

	public static void main(String[] args) {
		// 열거형(enums)
		// 1.jdk 1.5 추가
		// 2. 서로 관련된 상수를 편리하게 사용하기 위한 것
		// ex) 팀 프로젝트
		//    남/여 체크해서 코딩
		// A 팀원 1/0 체크 코딩
		// B 팀원 T/F 체크 코딩
		// C 팀원 'm'/'f' 체크 코딩
		// 표준화 X  , 유지 보수 어려움
		// 3. 열거형 선언 형식
		// enum 열거형이름 {상수명,상수명, ...};
		// 4. 열거형 -> 컴파일 -> 클래스
		//    열거형 부모클래스 java.lang.Enum
		// 5. 열거형 사용방법 : 열거형이름.상수명
		// 6. Enum 클래스
		//  1) name() : 열거형 상수 "이름"을 문자열로 변환
		//  2) ordinal() : 열거형 상수가 정의된 "순서" 반환
		//  3) valueOf() : name과 일치하는 "열거형 상수" 반환
		//  4) getDeclaringClass() : 열거형 "class 객체" 반환
		Card[] cards = Card.values();
		for (Card card : cards) {
			System.out.printf("%s\t%d\n",card.name(),card.ordinal());
		}		
		switch (Card.valueOf("HEART")) {
		case CLOVER:			
			break;
		case DIAMOND:			
			break;
		case HEART:
			System.out.println("하트!~~~~");
			break;
		case SPADE:			
			break;
		default:
			break;
		}
		
	}//main
//	class InnerA{
//		
//	}
//	interface innerIA{
//		
//	}
//	enum InnerCard{
//		
//	}
}//class
class A{
	
}
interface IA{
	
}
//enum Card{
//	
//}






