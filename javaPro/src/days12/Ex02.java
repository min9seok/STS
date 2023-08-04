package days12;

import java.util.Random;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 28. - 오전 10:27:15
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int lotto[] = new int[6];
		int lottos[][];
		System.out.print("> 로또 게임횟수 입력 ? ");
		int gameNumber = scanner.nextInt(); 
		
		lottos = new int[gameNumber][6];
		
		fillLottos(lottos);
		dispLottos(lottos);

	}

	private static void fillLottos(int[][] lottos) {
		int index , n;
		for (int i = 0; i < lottos.length; i++) { //게임횟수만큼 반복 생성
			index=0;
			Random rnd = new Random();
			while(index<= 5) {
				n = rnd.nextInt(45)+1;
				if(!isDuplicateLotto(lottos,i,n,index)) {
					lottos[i][index++] = n;				}
			}
		} // for
		
	}

	private static boolean isDuplicateLotto(int[][] lottos, int i, int n, int index) {
		for (int j = 0; j < index; j++) {
			if(lottos[i][j] == n) {
				return true;
			}
		} // for
		return false;
	}

	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임] : ",i+1);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("[%d]",lottos[i][j]);
			} // for
			System.out.println();
		} // for
		
	}

}
