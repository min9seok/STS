package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		// 본인의 이름을 입력 받아서 출력
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.next();
//		System.out.println(name);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("> name input ? ");
//		String name = br.readLine();
//		System.out.println(name);
		
		// 1.키보드로부터 입력 > 표준 입력 스트림
		// 바이트 스트림
//		InputStream is = System.in;
		System.out.print("> 한글 한 문자 입력 ?");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int code = isr.read();
		System.out.println( (char)code);
//		int code;
//		System.out.print("> name input ? ");
//		code = is.read(); // 1바이트(0~255 정수 int) 반환하는 메서드
//		System.out.println((char)code  ); // 한글은 1바이트를 넘기에 깨진다
		
//		byte cbuf[] = new byte[3];
//		System.out.print("> name input ? "); 
//		is.read(cbuf);
//		// byte[] cbuf > char one 변환
		
		// InputStream[Reader] 보조 문자스트림
		// byte > char 변환해주는 보조 스트림
		
		// Buffred[Reader] 버퍼 기능이 있는 보조 문자스트림 
		
	}//main

}//class
