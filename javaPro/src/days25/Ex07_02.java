package days25;

import java.io.File;
import java.io.FileWriter;

public class Ex07_02 {

	public static void main(String[] args) {
		// 실행 후 
		// 1. 저장할 파일명 입력 ???? 
		// 2. 저장할 문자열(Data) 입력 ???? 
		//  계속?
		// 저장할 문자열(Data) 입력
		//  계속? n
		// 저장 종료
		
		// 파일 저장
		String pathname = ".\\src\\days25\\sample.txt";
		File file = new File(pathname);
		// 파일의 존재유무 t/f 
//		System.out.println(file.exists());
		try(FileWriter fw = new FileWriter(file,false) ) {
//			fw.write(98);
			fw.write("새로 실행해서 텍스트 추가");
			// 쓰기 + 추가 fr 출력용 스트림에 쓰기+추가
//			fw.flush(); // 비우는 작업 close 시에 자동으로 flush 동작
//			file.createNewFile();			
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
	}//main

}//class
