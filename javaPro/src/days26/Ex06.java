package days26;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex06 {

	public static void main(String[] args) throws IOException {		
//		File 클래스
		// 1. 가장 많이 사용되는 입출력의 대상 - 파일(중요)
		// 2. 파일 + 디렉토리(폴더)
		String pathname = ".\\src\\days26\\Ex01.java";
//		String pathname = "C:\Users\\user\git\java\javaPro\src\days26\Ex01.java";
		File file = new File(pathname); 
//		file.isDirectory();
//		file.isFile();
//		file.length();
//		file.exists();
		System.out.println(File.pathSeparator); // OS에서 사용하는 경로 구분자 ;
		System.out.println(File.separator); // OS에서 사용하는 이름 구분자     \
		String filename = file.getName(); // 파일이름 EX01.java
		System.out.println(filename);
		int pos = filename.indexOf(".");
		System.out.println(filename.substring(0,pos));  // 확장자를 제외한 파일명 Ex01
		System.out.println(filename.substring(pos));  // 확장자 .java
		
		System.out.println(FileUtil.getExtension(filename));
		System.out.println(FileUtil.getBaseName(filename));
		
		System.out.println("-".repeat(50));
		System.out.println(file.getPath());  // 파일의 경로 .\src\days26\Ex01.java
		System.out.println(file.getAbsolutePath()); // 파일의 절대경로 C:\Users\\user\git\java\javaPro\.\src\days26\Ex01.java
		System.out.println(file.getCanonicalPath()); // 파일의 표준경로  C:\Users\\user\git\java\javaPro\src\days26\Ex01.java
		System.out.println(file.getParent()); // 파일의 부모 디렉토리 ".\src\days26"
		System.out.println(file.getParentFile()); // File 객체 반환 
		// com.util.FileUtil.java
		
	}//main

}//class
