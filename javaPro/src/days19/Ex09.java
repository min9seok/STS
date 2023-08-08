package days19;

import java.io.FileReader;

public class Ex09 {

	public static void main(String[] args) {
		// days19.Ex01.java 파일 읽어와서
		// 알파벳 대소문자 구분하지 않고 a-z
		// 배열에 저장 후 ### 막대그래프를 작성
		// A(20) : #x20
		// A(13) : #x13
		// 상대경로 : .(현재디렉토리) == userdir
		//            ..(상위디렉토리)
		String path = ".\\src\\days19\\Ex01.java";
		int counts[] = new int[26]; //대소문자 상관없는 알파벳 A-Z
		// counts[0] 'A' or 'a'
		try(FileReader fr = new FileReader(path) ) {
			int code;
			char one;
			while( (code=fr.read()) != -1  ){
//				System.out.println(code);
				one = (char) code;
				one = Character.toUpperCase(one);
				if(Character.isUpperCase(one) ) {
				counts[one-'A']++;
				}
			}
			// 막대그래프
			for (int i = 0; i < counts.length; i++) {				
				System.out.printf("%c(%d) : %s\n",i+'A',counts[i],"#".repeat(counts[i]));
			} //for
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}//main

}//class
