package days10;

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
public class Ex06_04 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor,eng,mat;
		int tot;
		double avg;
		int rank;
		final int STUDENT_COUNT =30; 

		String names[] =new String[STUDENT_COUNT];
		int kors[] = new int[STUDENT_COUNT];
		int engs[] = new int[STUDENT_COUNT];
		int mats[] = new int[STUDENT_COUNT];
		int tots[] = new int[STUDENT_COUNT];
		double avgs[] = new double[STUDENT_COUNT];
		int ranks[] = new int[STUDENT_COUNT];


		Scanner sc = new Scanner(System.in);
		int count =0;
		char con= 'y';
		do {
			System.out.print("> 이름, 국어,영어, 수학, 입력? ");
			
//			name = sc.next();
//			name = sc.nextLine();
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double)tot /3;
			rank =1;

			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;

			count++;

		
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		}while(Character.toUpperCase(con)=='Y');
		
		// 2번학생의 국어점수를 100점으로 수정
		kors[1] = 100;
		
		
		procRank(tots,ranks,count);

		printStudentInfo(names,kors,engs,mats,tots,avgs,ranks,count);
		
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

	public static void procRank(int[] tots, int[] ranks,int count) {		
		for (int i = 0; i < count; i++) {
			ranks[i] =1;
			for (int j = 0; j < count; j++) {
				if(tots[i] < tots[j]) {
					ranks[i]++;
				}
			} // for
		} // for	
	}

	public static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,int[] ranks,int count) {

		for (int i = 0; i < count; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t %d등\n",i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
		} // for
		
		
		
		
	}

}
