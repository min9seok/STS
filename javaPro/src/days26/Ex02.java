package days26;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author user
 * Data InputStream,outputStream
 *  바이트 스트림
 *  기본형 8가지를 읽기 쓰기 가능한 바이트 스트림
 *  
 */
public class Ex02 {

	public static void main(String[] args) {
		String name= "이지현";
		int kor =32, eng=29, mat=40;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = false;

		String fileName = ".\\src\\days26\\student.dat";
		try(FileOutputStream out = new FileOutputStream(fileName,true);
			DataOutputStream dos = new DataOutputStream(out)  ) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");

	}//main
}//class
