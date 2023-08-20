package days26;

import java.io.File;

public class Ex06_05 {

	public static void main(String[] args) {
		// days26 폴더 안에 upload 폴더 유무 확인 후 생성

		String pathname = ".\\src\\days26";
		File dir = new File(pathname, "upload");
//		createNewFile() 파일 생성 
//		createTempFile("파일명","확장자") 임시파일 생성 c:\\windows\\TEMP
//		delete() 파일 삭제
//		deleteOnExit() 응용프로그램 종료 시 파일 삭제
//		renameTo(File) 파일명 변경
//		mkdir() 폴더 생성
//		mkdirs() 폴더들 생성 부모 폴더 먼저 생성
		if( !dir.exists()){
			System.out.println(dir.mkdir());
		}else {
			dir.delete();
		}
		
		
	}//main

}//class
