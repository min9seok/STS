package days10;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		int n =125; //정수
		int share, reminder;
		String hex = "0123456789ABCDEF";
		// 문자열 다루는 클래스 Buffer 와 다르게 쓰레드 에서 안전이 안됨 
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			share = n / 16;
			reminder = n % 16;			
		sb.append(hex.charAt(reminder));
		n = share;
		}
		System.out.printf("0x%s",sb.reverse());
	}//main
	

}



