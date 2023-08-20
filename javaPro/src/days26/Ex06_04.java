package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex06_04 {

	public static void main(String[] args) {
		//days26 폴더 안에 있는 모든 파일을 검색해서
		// fileName 문자열을 찾아서 파일명과 라인번호 출력
		String pathname = ".\\src\\days26";
		String keyword = "fileName";

		File parent = new File(pathname); 
		File list[] = parent.listFiles();
		File f = null;
		String line = "";
		int lineNumber = 1;
		for (int i = 0; i < list.length; i++) {
			f = list[i];
			lineNumber = 1;
			String fileName = f.getName();
			System.out.printf("------------%s-------------\n",fileName);
			try(FileReader in = new FileReader(f);
					BufferedReader br = new BufferedReader(in) ) {
				while ((line = br.readLine())!= null) {					
					if(line.contains(keyword)  ) {
						line = line.replaceAll(keyword,"["+keyword+"]");
						System.out.printf("%d: %s\n",lineNumber,line);
					}
					lineNumber++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}




	}//main

}//class
