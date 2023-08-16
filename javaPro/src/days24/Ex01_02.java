package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex01_02 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\Java 팀 구성.txt";		
		ArrayList<MemberVO> teamList = null;		
		HashMap<String,ArrayList<MemberVO>> teamMap = new HashMap();
		String content = "";
		StringBuilder sb = new StringBuilder();
		String line = "";
		try(FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader)){
			while((line = br.readLine())!=null  ) {
//				System.out.println(line);
//				content += line;
				sb.append(line + "\r\n");
			}
			content = sb.toString();
//			System.out.println(content);
//			String pattern = 
//					  "{0}\r\n{1}\r\n"
//					+ "{2}\r\n{3}\r\\n"
//					+ "{4}\r\n{5}\r\n";
			 String pattern = 
	                  "{0}\r\n{1}(팀장),{2}\r\n";
			MessageFormat mf = new MessageFormat(pattern);
		Object datas[] = mf.parse(content);
		 System.out.println( datas[0]); // 1조
         System.out.println( datas[1]);  
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
