package days10;

import java.util.Arrays;

/**
 * @author minseok
 * @date 2023. 7. 26. - 오후 12:14:27
 * @subject
 * @content
 */
public class Ex03_02  {
	
	
	public static void main(String[] args)  {
		int m[] = new int[3];		
		m[0] =5;
		m[1] =3;
		m[2] =7;
//		 java.lang.ArrayIndexOutOfBoundsException
//		m[3] =10;
		int index=3;
		if(index ==m.length) {
			int temp[] = new int [m.length+3];
			for (int i = 0; i < m.length; i++) {
				temp[i] = m[i];				
			} // for
			m = temp;
		}
//		1. 원래 배열크기 +3
//		2. m > temp 요소 복사
//		3. temp 배열을 m 배열로 바꾸는 코딩;
		m[3] =10;
		System.out.println(Arrays.toString(m));
	}//main

}
