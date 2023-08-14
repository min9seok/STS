package days22;

import java.util.HashSet;

public class Ex14 {

	public static void main(String[] args) {
		
		// Collection 의 자식 
		// Set 인터페이스 구현한 컬렉션 클래스
		// 특징 - 순서가 유지X 중복 허용 X
		// - HashSet 컬렉션 클래스
		// Set + 순서가 유지 > LinkedHashSet
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		// [1, 9, 10, 15] 저장 순서와 다르게 나옴 유지X
		System.out.println(hs);
		
		hs.add(1);
		// [1, 9, 10, 15] 중복 허용 X
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		
		

	}//main

}//class
