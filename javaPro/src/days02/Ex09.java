package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 12:36:16
 * @subject
 * @content
 */
public class Ex09 {
	public static void main(String[] args ) throws IOException {
		String name;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		System.out.print("> 이름을 입력하세요 ?");
		name = br.readLine();
		System.out.printf("> 이름 : %s\n",name);
	} //main
} //class
 