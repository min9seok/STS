package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

 /**
 * @author user
 *  실행파일 복사 
 *  바이트 스트림
 *  FileInputStream
 *  FileoutputStream
 *  BufferedInputStream
 *  BufferedoutputStream
 */
public class Ex07_05 {

	public static void main(String[] args) {		
		// 파일 복사
		String pathname = "C:\\Users\\user\\git\\java\\javaPro\\src\\days23\\days23.Ex05.TreeSet.PNG";
		String copyPathname = "C:\\Users\\user\\Documents\\days23.Ex05.TreeSet_copy.PNG"; 
		// > 복사 처리 시간 : 35895400(ns)
		// > 복사 처리 시간 : 1036000(ns)
		
     	// > 복사 처리 시간 : 122551700(ns)
//		fileCopy_byteStream(pathname,copyPathname);
		// > 복사 처리 시간 : 868100(ns)
		fileCopy_byteStream02(pathname,copyPathname);
		
		
		
		
		
		
	}//main
	private static boolean fileCopy_byteStream02(String pathname, String copyPathname) {
		long start = System.nanoTime();
			
		final int BUFFER_SIZE = 1024;
		try(FileInputStream fis = new FileInputStream(pathname);
			FileOutputStream fos = new FileOutputStream(copyPathname,true);
			// 버퍼 기능 보조 스트림 
			BufferedInputStream bis = new BufferedInputStream(fis,BUFFER_SIZE);
			BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE)	) {			
			
			byte b[] = new byte[BUFFER_SIZE];
			int readByteNumber = 0;
			while ((readByteNumber = bis.read(b)) != -1 ) {				
				bos.write(b,0,readByteNumber);				
			}
			bos.flush();
			System.out.println(" 파일 복사 완료!!! ");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n",(end-start));
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	private static boolean fileCopy_byteStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
			
		
		try(FileInputStream fis = new FileInputStream(pathname);
			FileOutputStream fos = new FileOutputStream(copyPathname,true);			
				) {			
			int b;
			while ( (b = fis.read()) != -1) {
				fos.write(b);
			} 
			System.out.println(" 파일 복사 완료!!! ");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n",(end-start));
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
}//class
