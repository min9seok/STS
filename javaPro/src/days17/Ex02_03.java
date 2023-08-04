package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author user
 * 파일 읽어서 출력 + try-catch~finally 문
 *  한문자씩 읽는다  int fr.read()
 *  한라인씩 읽는다 BufferedReader  
 */
public class Ex02_03 {

	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";		 
		try (FileReader fr = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(fr);){			 //			 
			 String line = null;
			 int lineNumber = 1;
			 while( (line=br.readLine()) != null  ) {
				 System.out.printf("%d : %s\n",lineNumber++,line);
			 }
		}catch (FileNotFoundException  e) { 
			e.printStackTrace();
		}catch (IOException e) { 
			e.printStackTrace();
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}//main

}//class
