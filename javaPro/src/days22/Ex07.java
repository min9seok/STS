package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		//Vector 컬렉션 클래스
		// List 인터페이스를 구현한 클래스
		//  순서가 있고 중복 허용
		// ArrayList 와 동일 (차이점 = 멀티 스레드 안전 동기화 처리)
		Vector v = new Vector();
		
//		StringBuilder : 멀티 스레드 안전X 동기화 처리 X
//		StringBuffer : 멀티 스레드 안전 동기화 처리
		
		v.addElement("김호영"); // add() 동일
		v.add("김성준");
		v.add("이지현");
		
		System.out.println(v.size()); // 요소 갯수 
		System.out.println(v.capacity()); // 선언 된 공간		
		v.trimToSize(); //남는 공간 제거
		System.out.println(v.capacity());
		
		v.setSize(5); //요소를 null로 추가
		System.out.println(v.size());		
		System.out.println(v);
		
		v.get(0); // 0번째 요소 
		v.elementAt(0);
		// [반복자]와 [열거자]의 차이점
		Iterator ir = v.iterator();
		//The returned iterator is fail-fast.
		// 읽는중에 변경된 데이터가 있다면 예외를 발생시킨다
		
		// 열거자
		Enumeration en = v.elements();
		// hasMoreElements 요소 더 있니 ? T / F
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
//		String 제거한이름 = (String)v.remove(0);
//		v.removeElementAt(0);
		
		// v(벡터)에서 null 요소제거한 나머지 요소를 출력 
//		v.removeElement(null);
//		v.remove(null);
		v.removeIf(n -> n==null);
//		System.out.println(v);
		//              메서드 참조
		v.forEach(System.out::println);
//		v.forEach(n -> System.out.println(n));
		
//		v.clear();
//		v.clone();
//		v.firstElement(); < v.get(0);
//		v.lastElement();  >  v.get(v.size()-1);
		
//		v.insertElementAt("임경재", 1); == v.add(1,"임경재");
		
//		v.listIterator()
		
		List subList = v.subList(0, 2);
		System.out.println(subList);
		
		
		
	}//main

}//class 
