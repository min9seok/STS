package days04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int kor;
		String grade = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("> 점수 입력 ?  ");
		kor = sc.nextInt();
		switch (kor/10) {
		case 10:
		case 9:	
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		case 5:
			grade = "가";
			break;
		default:
			grade = "가";
			break;
		}		
		System.out.println(grade);		
	}

}
