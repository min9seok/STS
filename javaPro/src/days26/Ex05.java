package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author user
 *  Piped  Reader/Writer
 *  스레드 간에 데이터를 입/출력 시 사용하는 스트림
 *  Random Aceess File
 *   랜덤  + 접근   + 파일 스트림
 *   파일의 어느 위치에나 읽/쓰기 가능한 장점이 있는 스트림
 *    DataOutput    DataInput
 *     출력             입력
 *    seek( 위치 )
 *    getFilePointer()
 *    readXXX()
 *    writeXXX()    
 */ 
public class Ex05 {

	public static void main(String[] args) throws IOException  {
		
		String s = "I Love normla Java";
		String q = "javabook";
		
		String name = ".\\src\\days26\\random.txt";
		String mode = "rw";
		try(RandomAccessFile raf = new RandomAccessFile(name,mode); ) {
//			long cp = raf.getFilePointer();
			raf.writeBytes(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		// 일시정지 + 엔터 계속
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		try(RandomAccessFile raf = new RandomAccessFile(name,mode); ) {
			// 임의의 위치로 이동 = 읽/쓰기
			raf.seek(7);
			raf.writeBytes(q);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		try(RandomAccessFile raf = new RandomAccessFile(name,mode); ) {
			// 임의의 위치로 이동 = 읽/쓰기
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}//main

}//class
