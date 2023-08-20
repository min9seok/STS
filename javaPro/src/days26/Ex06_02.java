package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author user
 * JavaPro 모든 하위 폴더 파일 목록 정보 조회
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
//		C:\Users\\user\git\java\javaPro
//		System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
//		System.out.println(parent.isDirectory());  true
//		String list[] = parent.list();
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//			File f = new File(parent,list[i]);
//			System.out.printf("%s\t%s\t%d\n",f.isDirectory()?"[폴더]":"[파일]",f.getName(),f.length());
//		}
		File list[] = parent.listFiles();		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		for (int i = 0; i < list.length; i++) {
			long l = list[i].lastModified();
			Date date = new Date(l); 
			String 수정날짜 = sdf.format(date);
			System.out.printf("%s\t%s\t%d\t%s\n",list[i].isDirectory()?"[폴더]":"[파일]",list[i].getName(),list[i].length(),수정날짜);	
		}
	}//main

}//class
