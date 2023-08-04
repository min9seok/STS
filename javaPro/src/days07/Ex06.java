package days07;

public class Ex06 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10=-5
		int i;
		int sum=0;
		for(i=1;i<=10;i++) {
			sum += i%2==0?-i:i;
			System.out.print(i%2==0?i+"+":i+"-");
//			if(i%2==0) {
//			sum-=i;
//			System.out.print(i==10?i:i+"+");
//		}else {
//			sum +=i;
//			System.out.print(i+"-");
//		}			
		}
		System.out.println("="+sum);
	}

}
