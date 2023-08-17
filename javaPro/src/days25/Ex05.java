package days25;

import java.io.IOException;
import java.io.InputStream;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		/* 자바 입출력
		 * 1. IO = Input + output
		 *          입력      출력 == 입출력
		 * 2. [컴퓨터(프로그램)] 수신<->송신 [외부 장치(프로그램)]
		 *  프로그램 간에 데이터를 주고 받는 것
		 * 3. 두 장치를 연결해 주는 객체가 필요 스트림(Stream)
		 * 4. 스트림 : 데이터를 운반하는 통로 (빨대)
		 * 1) 흐르는 물 
		 * 2) 단방향
		 * 	ㄱ. 읽기(입력용) 
		 * 	ㄴ. 쓰기(출력용) 
		 * 5. 연속적인 데이터의 흐름
		 * 6. 자바의 모든 입출력은 스트림(Stream)이라는 개념으로 이루어진다.
		 * 7. ex)
		 *  키보드   > 수신 > 프로그램처리 > 송신 >   모니터
		 *  (표준입력장치)      기준           (표준출력장치)
		 *   System.in(스트림)               System.out(스트림)
		 * 8. 자바의 스트림 2가지 종류 구분
		 * 	1) 문자(텍스트)스트림 XXXReader , XXXWriter
		 * 		최상위 부모 클래스 : Reader (입력용)
		 * 		FileReader 문자단위 처리
		 *		BufferedReader ''(라인 단위) 		 
		 * 		최상위 부모 클래스 : Writer (출력용)
		 * 		FileWriter 문자단위 처리
		 * 		BufferedWriter ''(라인 단위)
		 * 1문자 = 유니코드 2바이트 = char
		 * 한 문자, 문자열, 문자 배열
		 *  2) 바이트(이진)스트림  XXXinputStream , XXXoutputStream 
		 *  	최상위 부모 클래스 : inputStream (입력용)
		 *  	최상위 부모 클래스 : outputStream (출력용)
		 * 1바이트(8비트)
		 * 바이트, 바이트 배열, 정수(int)
		 * InputStream is = System.in; // 바이트 스트림		
		   int nextByte = System.in.read();  
		   9. 보조 스트림 - 어떤 스트림의 IO를 더 쉽도록 보조 역활을 하는 스트림
		 */
		
		
		
		
		
		
		
	}//main

}//class
