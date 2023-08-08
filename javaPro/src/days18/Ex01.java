package days18;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {		
//		Integer m[] = {3,5,2,4,1};
		int m[] = {3,5,2,4,1};	
		System.out.println(Arrays.toString(m));
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
//		[1]
//		int temp[] = new int[m.length];
//		for (int i = m.length-1; i >= 0; i--) {
//			 temp[4-i] = m[i];			
//		} //for	
//		System.out.println(Arrays.toString(temp));
		
//		[2] 이유 이해 int는 기본형이라 integer 클래스를 사용해야한다
//		The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
//		Arrays.sort(m, Collections.reverseOrder());
//		System.out.println(Arrays.toString(m));
		
//		int[] -> integer[] 변환
		   // 박싱 언박싱
		Integer temp[] = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println(Arrays.toString(temp));

		
		
	}//main
}//class
