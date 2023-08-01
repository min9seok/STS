package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 26. - 오후 3:12:39
 * @subject 1번문제
 * @content
 */
public class Ex11 {
	// 한 학생의 성적 관리 Student 클래스 선언
	// days10.Ex06_04.java 1반 성적처리
	// daya12.Ex05.java 3반 성적처리
	public static void main(String[] args) throws IOException {
		String name;
		int kor,eng,mat;
		int tot;
		double avg;
		int rank;
		final int STUDENT_COUNT =30;
		
		Student students[] = new Student[STUDENT_COUNT];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();			
		} //for		
		Scanner sc = new Scanner(System.in);
		int count =0;
		char con= 'y';
		int no =1;
		do {
			System.out.print("> 이름, 국어,영어, 수학, 입력? ");

			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double)tot /3;
			rank =1;

			students[count].no = no++;		 
			students[count].name = name;		 
			students[count].kor = kor;		
			students[count].eng = eng;		
			students[count].mat = mat;		
			students[count].tot = tot;		
			students[count].avg = avg;		
			students[count].rank = rank;		

			count++;


			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		}while(Character.toUpperCase(con)=='Y');
		
		// 등수처리
		
		for (int i = 0; i < count; i++) {
			students[i].printStudentInfo();		
		} //for
		
	}//main

	public static String getName() {				

		Random rnd = new Random();
		char nameArr[] = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');			
		} // for
		String name = String.valueOf(nameArr);
		return name;
	}

	public static int getScore() {

		return (int)(Math.random()*101);
	}

}//class
