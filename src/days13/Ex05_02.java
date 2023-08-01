package days13;

import java.util.Iterator;

public class Ex05_02 {

	public static void main(String[] args) {
		 /*
	       * [배열 초기화]
	       * int [] m = new int[3];
	       * m[0]=1;
	       * m[1]=2;
	       * m[2]=3;
	       * 
	       * int [] m = new int[]{1,2,3};
	       * int [] m = {1,2,3};
	       * */

		// 클래스 배열 초기화
		// Tv tvArr[] = new Tv[3];
		// tvArr[0] = new Tv;
		// tvArr[1] = new Tv;
		// tvArr[2] = new Tv;
		// Tv tvarr[] = new Tv[]{new Tv,new Tv,new Tv};
		// Tv tvarr[] = {new Tv,new Tv,new Tv};
		Tv tvArr[] = new Tv[3];

		for (int i = 0; i < args.length; i++) {
			tvArr[i] = new Tv();			
		} //for
		
		tvArr[0].power();
		System.out.println("Tv : " + (tvArr[0].power? "ON":"OFF"));
		tvArr[0].channelUp();
		System.out.println("현재 채널 : " + tvArr[0].channel);
		tvArr[0].power();
		System.out.println("Tv : " + (tvArr[0].power? "ON":"OFF"));
		System.out.println(" end ");
		
		
		
		

	}//main

}//class
