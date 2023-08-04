package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };		
		int max=m[0];
		for (int i = 1; i < m.length; i++) {
			if(max<m[i]) {
				max = m[i];
			}
		} // for		
		System.out.println("max = "+max);
		int maxindexArr[] = new int[m.length];
		int index=0;
		for (int i = 1; i < m.length; i++) {
			if(max==m[i]) {
				maxindexArr[index++] = i;
				}
		} // for
		System.out.println(Arrays.toString(maxindexArr));
		
//		String.join(null, args)
		int arr[] =   Arrays.copyOf(maxindexArr, index);
		System.out.println(Arrays.toString(arr));
		String s = "index = ";
		for (int i = 1; i < arr.length; i++) {
			s += i+", ";
		}
		System.out.println(s.substring(0,s.length()-2));
//		String s = "index = ";
//		for (int i = 1; i < m.length; i++) {
//			if(max==m[i]) {
//				s += i+", ";
//			}
//		} // for
//		System.out.println(s.substring(0,s.length()-2));

	}//main

}
