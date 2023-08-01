package days12;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lottos[][];
		System.out.print("> 로또 게임횟수 입력 ? ");
		int gameNumber = scanner.nextInt(); 		
		lottos = new int[gameNumber][6];
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);
		} // for
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임] ",i+1);
			dispLotto(lottos[i]);	
		} // for		
		
	}//main

	private static void fillLotto(int lotto[]) {		
		int index=0;		
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] = lottoNumber;
		boolean flag = false; 
		while(index<=5) {
			flag = false;
			lottoNumber = (int)(Math.random()*45)+1;			
			for(int i = 0; i < index; i++) {
				if( lotto[i] == lottoNumber) {
					flag = true;
					break;
				}
			}
			if ( !flag ) {
				lotto[index++] = lottoNumber;
			}
		}	
	}

	private static void dispLotto(int lotto[]) {
		for (int i = 0; i < lotto.length; i++) {
						System.out.printf("[%02d]",lotto[i]);
		} // for
		System.out.println();
	}

}//class
