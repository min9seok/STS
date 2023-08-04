package days08;

public class Ex09_02 {

	public static void main(String[] args) {

		//배열 선언 및 생성
		// 배열을 초기화하지 않으면 int의 초기값으로 설정. 기억
		int lotto[] = new int[6];
		fillLotto(lotto);
		// lotto 배열을 출력 dispLotto() 함수 선언 + 호출		
		dispLotto(lotto);
	}//main

	private static void fillLotto(int lotto[]) {		
		int index=0;		
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] = lottoNumber;
		boolean flag = false; // 로또번호가 중복이 되면 true 할당
		while(index<=5) {
			System.out.print(lottoNumber+ "/");
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
		
//		for (int i = 0; j < lotto.length; i++) {
//			int lottoNumber = (int)(Math.random()*45)+1;
//			lotto[i] = lottoNumber;
//		} // for
	}

	private static void dispLotto(int lotto[]) {
		for (int i = 0; i < lotto.length; i++) {
						System.out.printf("lotto[%d]=[%d]\n",i,lotto[i]);
		} // for
		System.out.println();


	}

}
