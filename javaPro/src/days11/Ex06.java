package days11;

/**
 * @author minseok
 * @date 2023. 7. 27. - 오후 3:11:27
 * @subject 다차원배열
 * @content 1차원배열 , 2차원배열 , 3차원배열
 *               [ 다차원배열은 배열의 배열이다. ]
 */
public class Ex06 {

	public static void main(String[] args) {
		// 1) 3학년 10반 30명
		// 국어점수를 저장
		// 3 * 10 * 30 > 900
//		int kors[] = new int[900]; //열
		int kors[][][] = new int[3][10][30];
		// 2학년 4반 15번 학생의 국어점수 입력 : 90
		kors[1][3][14]=90;
		// 2학년 6반
//		kors[1][5][0]~kors[1][5][29] for문 
	}

}
