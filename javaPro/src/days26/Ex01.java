package days26;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author user
 * Data InputStream,outputStream
 *  바이트 스트림
 *  기본형 8가지를 읽기 쓰기 가능한 바이트 스트림
 *  
 */
public class Ex01 {

	public static void main(String[] args) {
		String name= "이지현";
		int kor =32, eng=29, mat=40;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = false;
		// 한 학생 정보를 student.txt 파일에 저장
//		FileWriter     문자 파일스트림
//		BufferedWriter 문자 보조스트림
		String fileName = ".\\src\\days26\\student.txt";
		try(FileWriter out = new FileWriter(fileName,true);
			BufferedWriter bw = new BufferedWriter(out)) {
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n",name,kor,eng,mat,tot,avg,gender);
			bw.append(data);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");

	}//main
}//class
