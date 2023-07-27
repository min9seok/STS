package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04_02 {

	public static void main(String[] args) {
		int m[] = new int[30];
		int n;
		int count[] = new int[10];
		for (int i = 0; i < m.length; i++) {
//			m[i] = (int)(Math.random()*10);
			n = getRandomInt(0, 9);
			m[i] = n;
			count[n]++;
		} // for
		System.out.println(Arrays.toString(m));		
	}//main
	public static int getRandomInt(int min , int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
	
}
