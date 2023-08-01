package days06;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("> 이름 입력 ? "); 
		//name = sc.next(); 공백 미포험 \r \n 을 지워버림 
		name = sc.nextLine(); // 공백 포함 한줄을 읽어옴 
//		System.out.println(name);
//		[1]
//		char nameArr[] = new char[name.length()];
//		for(int i =0; i <nameArr.length; i++) {
//			nameArr[i] = name.charAt(i);			
//		}
//		System.out.println(Arrays.toString(nameArr));
		
		// char[] Stinrg.toCharArray();
		// String -> char[] 변환
		char nameArr[] = name.toCharArray();		
		// char[] > String 변환
		name = String.valueOf(nameArr);
		sc.close();
	}

}
