package days13;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex11_02 {

	public static void main(String[] args) throws IOException {
		// 3반 30명 학생의 성적 처리 > Student 클래스 사용 수정
		final int STUDENT_COUNT =30;
		final int CLASS_COUNT =3;

		Student students[][] = new Student[CLASS_COUNT][STUDENT_COUNT];
		for (int i = 0; i < students.length; i++) {
			for(int j=0; j< students[i].length;j++) {
				students[i][j] = new Student();	
			}				
		} //for		
		char con = 'y';
		int counts[] = new int[CLASS_COUNT];
		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;
		Scanner scanner = new Scanner(System.in);

		int ban;
		do {
			System.out.print("> 반 입력 ?");
			ban = scanner.nextInt(); // 1 , 2 , 3
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ?",ban,counts[ban-1]+1);
			name = days10.Ex06_04.getName();
			kor = days10.Ex06_04.getScore();
			eng = days10.Ex06_04.getScore();
			mat = days10.Ex06_04.getScore();
			tot = kor+eng+mat;
			avg = (double)tot/3;
			wrank = rank = 1;
			
			// 클래스 복사
			Student s = students[ban-1][counts[ban-1]];
			
			s.no = counts[ban-1]+1;
			s.name = name;
			students[ban-1][counts[ban-1]].kor = kor;
			students[ban-1][counts[ban-1]].eng = eng;
			students[ban-1][counts[ban-1]].mat = mat;
			students[ban-1][counts[ban-1]].tot = tot;
			students[ban-1][counts[ban-1]].rank = rank;
			students[ban-1][counts[ban-1]].wrank = wrank;
			students[ban-1][counts[ban-1]].avg = avg;

			counts[ban-1]++;

			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		}while(Character.toUpperCase(con)=='Y');

		for (int i = 0; i < counts.length; i++) { //반
			for (int j = 0; j < counts[i]; j++) { // 힉생
				Student s1 = students[i][j];
				s1.rank = 1;// 반등수
				s1.wrank = 1;// 전교등수
				for (int i2 = 0; i2 < counts.length; i2++) {							
					for (int j2 = 0; j2 < counts[i]; j2++) {
						Student s2 = students[i][j];
						if(s1.tot < s2.tot) {
							s1.wrank++;
							if(i==i2) {
								s1.rank++;
							}
						}
					}
				}
			} // for
		} // for
		int count=IntStream.of(counts).sum();			
		System.out.printf("\t\t학생 정보 출력(%d명)\n",count);
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명 ]\n",i+1,counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				Student s = students[i][j];
				s.printStudentInfo();
//				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",s.no,s.name,students[i][j].kor,students[i][j].eng
//						,students[i][j].mat,students[i][j].tot,students[i][j].avg,students[i][j].rank,students[i][j].wrank);
			} // for			
		} // for
	}//main

}//class
