package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		// List - ArrayList 컬렉션 클래스
		
		// 1) String [] -> ArrayList 변환
		String nameArr[] = {"송해영","유희진","임경재","정하영"};
		// [1]
//		ArrayList list = new ArrayList();
//		for (int i = 0; i < nameArr.length; i++) {
//			list.add(nameArr[i]); 
//		}
//		System.out.println(list);
		// [2] Type == 클래스
//		List<T> list = Arrays.asList(T..a);
		List list = Arrays.asList(nameArr);
		System.out.println(list);
		
		// ArrayList
		ArrayList list2 = new ArrayList(list); 
		System.out.println(list2);
		
		// 2) ArrayList -> String [] 변환
		
		
	}//main
}//class
