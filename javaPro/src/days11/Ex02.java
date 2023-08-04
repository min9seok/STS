package days11;

import java.util.Arrays;

/**
 * @author minseok
 * @date 2023. 7. 27. - 오전 10:44:04
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		int m[] = {3,5,2,4,1};
		
		int n =4;
		int index = sequentialSearch(m,n);
		System.out.println("> index : "+index);
		
		int temp[] = new int[m.length+1];
		for (int i = 0; i < m.length; i++) {
//			if(index > i) {
//			temp[i] = m[i]; 
//			}else {
//				temp[i+1] = m[i];
//			}		
			temp[index>i?i:i+1] = m[i];
		} // for
		temp[index] = 100;
		m = temp;
		System.out.println(Arrays.toString(temp));
	}//main

	public static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if(n == m[i]) {
				index = i;
				break;
			}
		} // for
				
		return index;
	}

}
