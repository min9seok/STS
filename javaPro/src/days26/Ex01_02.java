package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @author user
 * Data InputStream,outputStream
 *  바이트 스트림
 *  기본형 8가지를 읽기 쓰기 가능한 바이트 스트림
 *  
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		// 한 학생 정보를 student.txt 파일에 저장
//		FileReader     문자 파일스트림
//		BufferedReader 문자 보조스트림
		String fileName = ".\\src\\days26\\student.txt";
		try(FileReader in = new FileReader(fileName);
			BufferedReader br = new BufferedReader(in)) {
			String line = br.readLine(); 
			System.out.println(line);
			String pattern = "{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern);
			Object objs[] = mf.parse(line);
//			for (Object obj : objs) {
//				System.out.print(obj+",");
//			}
			name = (String) objs[0];
			kor = Integer.parseInt((String)objs[1]);
			eng = Integer.parseInt((String)objs[2]);
			mat = Integer.parseInt((String)objs[3]);
			tot = Integer.parseInt((String)objs[4]);
			avg = Double.parseDouble(objs[5].toString());
			gender = Boolean.parseBoolean(objs[6].toString());
			System.out.printf("%s,%d,%d,%d,%d,%f,%b\n",name,kor,eng,mat,tot,avg,gender);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");

	}//main
}//class
