package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * 제네릭(Generics)
		 * 1. JDK1.5 - 제네릭
		 *    JDK1.8 - 람다식
		 * 2. 제네릭이란?
		 * [다양한 타입]의 객체를 다루는 메서드, 컬렉션 클래스에서 [컴파일시] 타입을 체크해 주는 기능
		 * 3. 왜? 제네릭의 장점
		 * 객체의 타입을 컴파일 시에 체크하기 때문에 1)객체의 타입 안정성을 높이고, 2)형 변환의 번거로움이 줄어든다 3)코드가 간결해 진다
		 *  
		 */
//		ArrayList list = new ArrayList();
//		list.add("홍길동");
//		// String <- Object get() 다운캐스팅
//		String name = (String) list.get(0);
//		System.out.println(name);
//		list.add(20);
//		// int <- Integer <- Object
//		int age = (int) list.get(1);
//		System.out.println(age);
//		list.add(true);
//		list.add('A');
		
		// 제네릭 클래스
		ArrayList<String> list = new ArrayList();
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("박길동");
//		String name = list.get(0);
//		System.out.println(name);
//		Iterator ir = list.iterator();
//		while (ir.hasNext()) {
			// 다운 캐스팅
//			String name = (String) ir.next();
//			System.out.println(name);
//		}
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			String name = ir.next();
			System.out.println(name);
		}
	}//main

}//class
