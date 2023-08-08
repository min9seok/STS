package days19;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.StringJoiner;

public class Ex03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가";
		byte bArr[] = str.getBytes("UTF-8");
		
//		 for(int i=0; i<bArr.length;i++) {
//			 System.out.printf("[%02X]:",bArr[i]);
//		 }
//		 System.out.println();
		
		printByteArr(bArr); // 한글 한준자 : 3바이트 처리
		// "가" > 3바이트 UTF-8 byte[] > "가"
		String s = new String(bArr, "UTF-8");
		System.out.println(s);
		bArr = str.getBytes("EUC-KR");
		printByteArr(bArr); // 한글 한문자 : 2바이트 처리
		// "가" > 2바이트 EUC-KR byte[] > "가"
		s = new String(bArr, "EUC-KR");
		System.out.println(s);
		
	}//main

	private static void printByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":","[","]");
		for(int i=0; i<bArr.length;i++) {
			 sj.add(String.format("%02x",bArr[i]));
		 }
		System.out.println(sj.toString());
	}

}//class
