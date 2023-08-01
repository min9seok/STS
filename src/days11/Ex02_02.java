package days11;

import java.util.ArrayList;

/**
 * @author minseok
 * @date 2023. 7. 27. - 오전 10:44:04
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
//		검색(search)
//		1. 순차검색 (sequential(sequence) Search)
//		2. 이진검색 (binery Search)  + 정렬 
		
//		int m[] = {3,5,2,4,1};
		// 위의 코딩처럼 배열 m을 사용 > 단점
		// 1. 요소추가 (배열크기 자동 증감X)
		// 2. 요소삽입
		// 3. 요소삭제
		// 4. 요소수정X
		
		// -> 컬렉션(collection) 클래스
//		ArrayList<E> jdk 1.5 제네릭스
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(6);
		
		
		int index = list.indexOf(4); //요소의 위치
		System.out.println(index);
		System.out.println(list);
		list.add(index,100); //요소 삽입
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
