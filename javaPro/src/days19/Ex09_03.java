package days19;

import java.io.FileReader;

public class Ex09_03 {

	public static void main(String[] args) {
		String path = ".\\src\\days19\\Ex01.java";
		int counts[][] = new int[3][]; // 가변 배열 
		counts[0] = new int[26];
		counts[1] = new int[26];
		counts[2] = new int[10];
//		int nums[] = new int[10];
		try(FileReader fr = new FileReader(path) ) {
			int code;
			char one;
			while( (code=fr.read()) != -1  ){
				one = (char) code;
				if(Character.isUpperCase(one) ) {
					counts[0][one-'A']++;
				}else if(Character.isLowerCase(one)) {
					counts[1][one-'a']++;
				}else if(Character.isDigit(one)) {
					counts[2][one-'0']++;
				}
			}
			// 막대그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%s]문자\n", i==0?'대':i==1?'소':"숫자");
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d) : %s\n",i==0?j+'A':i==1?j+'a':j+'0',counts[i][j],"#".repeat(counts[i][j]));
				}
			} //for
//			for (int i = 0; i < nums.length; i++) {
//				System.out.println(nums[i]);				
//			} //for
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}//main

}//class
