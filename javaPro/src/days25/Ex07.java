package days25;

import java.io.File;
import java.io.FileReader;
import java.net.MalformedURLException;

public class Ex07 {

	public static void main(String[] args) throws MalformedURLException {
		String pathname = ".\\src\\days25\\Ex01.java";
//		File 클래스 : 파일,폴더(디렉토리)를 다루는(생성,수정,삭제,조회) 클래스
		File file = new File(pathname);
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		long fileLength = file.length();
		System.out.printf("> 파일 크기 : %d(bytes)\n",fileLength);
		try(FileReader fr = new FileReader(file) ) {
			
			int code ;
			// 라인단위로 처리하는 보조스트림 사용하면 라인번호 앞에 붙일떄 더 코딩이 편해진다
			while ( (code = fr.read())!= -1) {
				System.out.printf("%c",(char)code);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		String parent = ".\\src\\days25";
//		String child = "EX01.java";
//		File f = new File(parent, child);
		
	}//main

}//class
