package days24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex03 {

	public static void main(String[] args) {
		// Arrays : 배열 사용하기 쉽도록 기능 구현된 클래스
		// sort() , binarySearch(), fill(), copy() 
		// Collections 클래스
		ArrayList<Integer> list = new ArrayList(); 
		System.out.println(list);		
		// 1,2,3,4,5
//		list.add(1) ;
		// Collection<? super Object>, Object...)
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list,-1);
		System.out.println(list);
//		Collections.copy(null, null);
//		Collections.replaceAll(null, null, null);
		
		
	}//main

}//class
