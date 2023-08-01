package days09;

import java.util.Arrays;

/**
 * @author minseok
 * @date 2023. 7. 25. - 오전 10:11:18
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int n =10; //정수		
		int con = 0; //몫
		int num =0; //나머지
		//		[3]		
		String s = "";
		int binaryArr[] = new int[32];
		int index = binaryArr.length-1;
		while(n>0) {
			con = n/2;	// 몫  5		
			num = n%2; //나머지 0
			System.out.println(num);
			binaryArr[index--] = num;
			s += num;
			n = con;			
		}		
		System.out.println(Arrays.toString(binaryArr).replace(", ",""));

//		StringBuilder sb = new StringBuilder();
//		 System.out.println(s.reverse());
		
//		[2]
//		String b = Integer.toBinaryString(n);
//		System.out.println(b);
//		String s = String.format("%032d\n",Integer.parseInt(b));
//		System.out.println(s);
		
//		[1]
//		Integer.toBinaryString(n);
//		String s = "00000000000000000000000000000000";
//		String b = Integer.toBinaryString(n);
//		s +=b;
//		System.out.println(s);
//		System.out.println(s.substring(b.length()));

	}//main

}
