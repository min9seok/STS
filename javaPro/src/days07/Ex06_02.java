package days07;

public class Ex06_02 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10=-5
		// [ 스위치 변수 선언 코딩 ]
		boolean sw = false; // 기본값 false
		int i;
		int sum=0;
		for(i=1;i<=10;i++) {
//			if(sw) {
//			sum-=i;
//			System.out.print(i==10?i:i+"+");
////			sw = false;
//		}else {
//			sum +=i;
//			System.out.print(i+"-");
////			sw = true;
//		}
		sum += sw?-i:i;
		System.out.printf(sw?"%d+":"%d-",i);
		sw = !sw;
		}
		System.out.println("="+sum);
	}

}
