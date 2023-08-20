package days26;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import com.util.FileUtil;

public class Ex06_03 {

	public static void main(String[] args) {
		// days26 폴더 안에 java 파일 골라서 조회
		String pathname = ".\\src\\days26";
		File dir = new File(pathname);		
		String fileName="";
//		[3] 람다식
		File list[] = dir.listFiles((d,n)-> n.endsWith(".java"));
		for (File file : list) {
			System.out.println(file.getName());
		}
//		[2]
//		File list[] = dir.listFiles(new FilenameFilter() {		
//			@Override
//			public boolean accept(File dir, String name) {
////				System.out.println(dir+"***"+name);
//				return name.endsWith(".java");
//			}
//		});
//		for (File file : list) {
//			System.out.println(file.getName());
//		}
//		[1]
//		for (int i = 0; i < list.length; i++) {			
//			if(list[i].isFile()) {
//			 fileName = list[i].getName();
//			if (fileName.endsWith(".java")) {
//				System.out.println(fileName);
//			}
//			}
//			FileUtil.getExtension(fileName).equals(".java");
//		}

	}//main

}//class
