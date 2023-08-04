package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 2:01:04
 * @subject String -> byte , short, int ,long 형변환하는 방법 ???.parseByte();
 * @content
 */
public class Ex10 {
	public static void main(String[] args) throws IOException{
		byte age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이를 입력하세요 : ");
		String inputData = br.readLine();
		age = Byte.parseByte( inputData );		
		System.out.printf("> 나이는 %d살입니다.",age);

	}//main

}//class
