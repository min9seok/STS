package days10;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int n =125; //정수
		char ch[] = {'A','B','C','D','E','F'};
		String s ="";
		char one;
		int share, reminder;
		while(n!=0) {
			share = n / 16;
			reminder = n % 16;
			if(reminder >=10) {
				one =ch[reminder-10];
			}else {
				one = (char)(reminder+'0'); 	
			}		
			s = one +s;
			n = share;
		}
		System.out.printf("0x%s",s);
	}//main
	

}



