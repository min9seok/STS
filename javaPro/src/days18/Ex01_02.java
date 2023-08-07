package days18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author user
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String names[] = {"김호영","박정호","주강민","김정주","고경림"};
		System.out.println(Arrays.toString(names));
		// 이름을 오름차순 정렬 출력
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));		
		// 이름을 내림차순 정렬 출력
//		[1]
//		String temp[] = new String[names.length];
//		for (int i = names.length-1; i >= 0; i--) {
//			 temp[4-i] = names[i];			
//		} //for		
//		System.out.println(Arrays.toString(temp));
		
//		[2] 배열 > 기능 구현 클래스 Arrays
//		   컬렉션 > 기능 구현 클래스 Collections 
//		Arrays.sort(names, Collections.reverseOrder());
//		Arrays.sort(names, Comparator.reverseOrder());
//		System.out.println(Arrays.toString(names));
		
//		[3] 익명클래스
//		Arrays.sort(names , new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {		
//				//return o1.equals(o2);
//				return o2.compareTo(o1); // 양수, 0 , 음수
//			}
//		});
//		System.out.println(Arrays.toString(names));
		
//		[4] 익명클래스를 람다식으로 표현
		Arrays.sort(names , (o1, o2)  -> o2.compareTo(o1)); // 양수, 0 , 음수			
		System.out.println(Arrays.toString(names));
		
	}// main
 
} //class
