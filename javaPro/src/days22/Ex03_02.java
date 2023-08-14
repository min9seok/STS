package days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박민석");
		list.add("유희진");
		list.add("고경림");
		list.add("임경재");
		list.add("이지현");
		list.add("김정주");
		list.add("김호영");
		
		dispList (list);
		list.remove("김.+");
		System.out.println(list);
		list.size(); // 요소의 갯수
		list.trimToSize(); // 선언하고 남은 갯수 제거
		
		String regex = "김.+";
//		name.charAt(0) == '김';
//		name.startsWith('김');
		
	}//main
	private static void dispList(ArrayList list) {
		// 반복자 사용
		Iterator ir = list.iterator();
		// hasNext 다음 값이 있으면 T 없으면 F
		while (ir.hasNext()) {
			String name = (String) ir.next(); // next 다음 요소를 얻어오는 메서드
			System.out.println(name);
			
		}
		
		
	}
}//class

