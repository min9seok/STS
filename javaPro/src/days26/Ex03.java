package days26;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author user
 * Sequence InputStream
 *   순차적      바이트 스트림
 *   하나의 파일을 여러 파일로 분리 한 것 읽어올떄 사용
 *   여러 개의 입력스트림을 연속적으로 연결하여 하나의 스트림으로 데이터 처리 
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		// 1,2,3,4,5,6,7,8,9
		byte a[] = {1,2,3};
		byte b[] = {4,5,6};
		byte c[] = {7,8,9};
		//byte[] > ByteArrayInputStream 메모리 스트림
		ByteArrayInputStream bais1 = new ByteArrayInputStream(a);
		ByteArrayInputStream bais2 = new ByteArrayInputStream(b);
		ByteArrayInputStream bais3 = new ByteArrayInputStream(c);
		// bais1~3 바이트스트림 > 순차 처리
//		[1]
//		SequenceInputStream sis = new SequenceInputStream(bais1,bais2);
//		SequenceInputStream sis2 = new SequenceInputStream(sis,bais3);
//		[2] 순서 있는 컬랙션 클래스 bais1~3
//		List : ArrayList X , Vector 
		Vector<ByteArrayInputStream> list = new Vector();
		list.add(bais1);
		list.add(bais2);
		list.add(bais3);
		Enumeration<ByteArrayInputStream> en = list.elements();  
		SequenceInputStream sis = new SequenceInputStream(en);
		int code;
		while ((code = sis.read())!= -1  ) {
			System.out.println(code);
		}
	}//main

}//class
