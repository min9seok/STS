package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {

	public static void main(String[] args) {
		// 큐(Queue) 단방향으로 들어오고 나갈수있다
		// 디큐  (Deque) 양방향으로 들어오고 나갈수있다 
		//  <               <
		//     ------------
		//	→    C 	B  A     →  
		//     ------------
		// offer()    poll()   peek
 		//  push       pop     (스택)
		// FIFO구조  선입선출 방식
		
		// Collection 인터페이스를 상속받은 인터페이스
//		Queue q = new LinkedList();
		Deque q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		q.offerFirst("홍길동");
//		q.offerLast(q);
		
//		q.pollFirst();
//		q.pollLast();
		
		
		while( !q.isEmpty() ) {		
			System.out.println(q.poll());
//			String name = (String)q.remove();
//			System.out.println(name);
		}
		
	}//man

}//class
