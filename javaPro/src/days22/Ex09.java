package days22;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		// ArrayList
		// Vector
		// LinkedList
		// 스택(Stack)과 큐(Queue)
		// 1번쨰부터 시작
		//     -----------┐
		//	→    C 	B  A  │
		//     -----------┘
		// LIFO구조 선입후출 방식
		// -> push()
		// <- pop()값 확인 후 제거   peek()값만 확인
		//    empty()
		// index <    search()
		//  -1
		
		// 스택 활용 : 웹브라우저 뒤/앞으로가기
		// Vector가 부모클래스 동기화처리
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");		
		System.out.println(s);
		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		//EmptyStackException
//		System.out.println(s.pop());
//		while( !s.empty() ) {
//			System.out.println(s.pop());	
//		}
//		System.out.println(s.peek());
//		System.out.println(s.peek());
//		System.out.println(s.peek());
//		System.out.println(s.peek());
		
//		System.out.println(s.search("임경재"));
		
	}//main
}//class
