package days22;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Ex12 {

	public static void main(String[] args) {
		// ArrayList - List     요소
		// Vector - List (동기화) 요소(element)
		// LinkedList - List    노드(Node)
		// Stack - LIFO구조, Vector가부모 , List
		//          push() , pop() , peek()
		// Queue(I) - FIFO구조 , LinkedList
		// Deque(I)  
		//             add() poll() peek()
		// PriorityQueue 우선순위 
		
		// iterator(반복자) , Enumeration(열거자)
		// ListIterator(반복자)
		//  ㄴ iterator에 양방향 조회기능 추가
		//  ㄴ List 구현한 클래스만 사용 가능
		
		// hasNext() hasPrevious()
		// next()    previous()
		Vector v = new Vector();
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("> 역 방향으로 진행");
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
	}//main

}//class
