package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.util.FileUtil;

public class Ex06_08 {
	public static void main(String[] args) {
		String parent = ".\\src\\days26";
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Elasticsearch를 활용한 Java(자바) Full-Stack 개발자 양성과정(I).v1.hwp";
		
		File f = new File(parent,child);
		// > 파일 크기 : 293376bytes
		System.out.println("> 파일 크기 : " + f.length() + "bytes");
				
		final int VOLUME = 10 * 1024; // 10 KB
		
		String baseName = FileUtil.getBaseName(child);
		String ext = FileUtil.getExtension(child);		
//		System.out.println(baseName);
//		System.out.println(ext);
		int code=0;
		int i = 0; // 10KB 카운트
		int index = 0;		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try(FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis); ){
			while ( (code = bis.read())!= -1 ) {
				if( i % VOLUME == 0) {
					if(i!=0) {
					bos.close(); // 저장 후 닫기
					}
					child = String.format("%s_%d%s",baseName,++index,ext);
					System.out.println(child);
					File temp = new File(parent,child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				}
				bos.write(code);
				i++;
			}
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
