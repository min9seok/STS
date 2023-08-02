package days08;

import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오전 11:11:00
 * @subject 7일차 복습 함수문제
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int kor  =getScore(sc, "국어");
			char grade = (char) getGrade(kor);
			System.out.printf("> kor=%d, grade=%c\n",kor,grade);
//			int eng =getScore(sc, "영어");
//			int mat =getScore(sc, "수학");
//			System.out.printf("> kor=%d, eng=%d, mat=%d\n",kor,eng,mat);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main
	public static int getScore(Scanner sc , String subject) {
		int score=0;
		boolean flag = false;
		String inputData;
		String regex = "100|[1-9]?\\d";

		do {
			if(flag) {
				System.out.println(">> 점수 입력 잘못(0-100)");
			}
			System.out.printf(">%s점수 입력하세요? ",subject);				
			inputData = sc.next();				
			flag = true;
		} while (!inputData.matches(regex));			
		score = Integer.parseInt(inputData);

		return score;
	}
	public static int getGrade(int score) {
		char grade = '가';
		switch (score/10) {
		case 10:
		case 9:
			grade ='수';
			break;
		case 8:
			grade ='우';
			break;
		case 7:
			grade ='미';
			break;
		case 6:
			grade ='양';
			break;
		default:
			grade ='가';
			break;
		}		
		return grade;		
	}
	public static char upper(char a) {
		char upper;
		upper = Character.toUpperCase(a);		
		System.out.println(upper);
		return a;
	}
	public static int sum(int a ,int b) {
		int sum;
		sum = a+b;		
		return sum;
	}
}
