package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex13 {

	public static void main(String[] args) {
		// 1. 컬렉션 클래스 - ArrayList
		// 가장 많이 사용되는 컬렉션 클래스
		// List 인터페이스를 구현한 클래스
		// (순서 유지, 중복 허용)
		// 배열 요소(Element)
		// 배열 단점 보완 > ArrayList  참고 days10.Ex03.java
		String names[] = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println(names.length);
//		names[3] = "이지현";
		// 검색 후 출력
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("정하영")) {
				System.out.println(names[i]);		
			}
		}
		Arrays.fill(names,null);
		
//		ArrayList list = new ArrayList(); // 10
		ArrayList list = new ArrayList(3);
		list.add("주강민");
		list.add("정하영");
		list.add("임경재");
		System.out.println(list.size());
		list.add("이지현");
		System.out.println(list.contains("정하영"));
		int index = list.indexOf("정하영");
		if(index != -1) {
		System.out.println(list.get(index));
		list.remove(index);
		list.add(index,"홍길동");
		}else {
			System.out.println("없다");
		}
		System.out.println(list);
//		list.clear();
		
		System.out.println(list.isEmpty());
		System.out.println(list);
//		index = list.lastIndexOf("정하영");
		
		// iterator 요소를 순차적으로 처리하는 반복자를 반환하는 메서드 *******
		Iterator ir = list.iterator();
		// hasNext 다음 값이 있으면 T 없으면 F
		while (ir.hasNext()) {
			String name = (String) ir.next(); // next 다음 요소를 얻어오는 메서드
			System.out.println(name);
			
		}
		
		
		
		
		
		
	}//main
}//class
