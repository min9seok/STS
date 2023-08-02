package days10;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		int n =125; //정수
		int share, reminder;
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String s ="";				
		while(n!=0) {
			share = n / 16;
			reminder = n % 16;			
			s = ch[reminder] +s;
			n = share;
		}
		System.out.printf("0x%s",s);
	}//main
	

}



