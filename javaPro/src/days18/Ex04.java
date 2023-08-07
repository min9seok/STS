package days18;

public class Ex04 {

	public static void main(String[] args) {
		// Object.hashCode() 메서드
		// 해시 > 해시함수(해시(해싱)기법)
		//   ㄴ 데이터 관리 기법 중 하나
		//   ㄴ    ''       : 저장, 검색 등등
		//   ㄴ 객체 저장된 주소값을 해시코드로 변환 반환하는 메서드
		// [참고] 동일한 객체 체크 = equals() + hashCode() 오바리이딩
		
		// 하나의 인스턴스
//		String s1 = "홍길동";
//		String s2 = "홍길동";
		
		// 두개의 인스턴스
		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		
		// 오버라이드 문자열이 같으면 같도록 되어있음
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}//main

}//class
