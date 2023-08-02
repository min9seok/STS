package days08;

public class Ex11 {

	public static void main(String[] args) {
		int money = 125760;
		int count = 0; //화폐수량
		//화폐단위 5만원,1만원,5천원,1천원,5백원,1백원,5십원,1십원,5원,1원
		
		// 5만원 : 2개
		count = money/50000;
		System.out.println("5만원 : "+count);
		money %= 50000;
		// 1만원 : 2개
		count = money/10000;
		System.out.println("1만원 : "+count);
		money %= 10000;
		// 5천원 : 1개
		count = money/5000;
		System.out.println("5천원 : "+count);
		money %= 5000;
		// 1천원 : 0개
		count = money/1000;
		System.out.println("1천원 : "+count);
		money %= 1000;
		// 5백원 : 1개
		count = money/500;
		System.out.println("5백원 : "+count);
		money %= 500;
		// 1백원 : 2개
		count = money/100;
		System.out.println("1백원 : "+count);
		money %= 100;
		// 5십원 : 1개
		count = money/50;
		System.out.println("5십원 : "+count);
		money %= 50;
		// 1십원 : 1개
		count = money/10;
		System.out.println("1만원 : "+count);
		money %= 10;
		//   5원 : 0개
		count = money/5;
		System.out.println("5원 : "+count);
		money %= 5;
		//   1원 : 0개
		count = money/1;
		System.out.println("1원 : "+count);
		money %= 1;
	}

}
