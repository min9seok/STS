package days08;

public class Ex08 {

	public static void main(String[] args) {
		// 2^3= 2*2*2 =8
		// 2^-3= 1/(2^3) == 1/8 = 0.125
		// [거듭제곱] == 두승 == 멱 == pow
		// 밑수(2)를 지수(3)만큼 반복해서 곱하는 것
		
		//일반 함수
//		double result = pow(2,3);
//		System.out.println( result );
		//재귀 함수
		double result = recursivePow(2,0);
//		double result = recursivePow(2,-3);
		System.out.println( result );

	}
	//일반함수
	//2^3 = 2*2*2
	//	2^3=1/(2^3)= 1/(2*2*2)
	// 누승(거듭제곱) 제귀함수
	// 2^-3
	// 1/(rp(2,3) )
	private static double recursivePow(int n, int m) {
		if(m>1) {
			return n *recursivePow(n,m-1);			
		}else if(m==1) {
			return n;
		}else if(m==0) {
			return 1;
		}
		else {
			return (double)1/(recursivePow(n,-1*m));			
		}
	}
	//일반함수
//	private static double pow(int n, int m) {
//		double result=1;
//		int exp= Math.abs(m); //절대값 반환함수 abs()
////		if(m<0) {
////			exp = -1*m; //양수
////		}
//		
//		for (int i = 1; i <= exp; i++) {
//			result *= n;			
//		}		 
//		if(m <0) {
//			return (double)1/result;
//		}else {
//		return result;
//		}
//	}
	private static double recursivePow(double result) {
		// TODO Auto-generated method stub
		return 0;
	}

}
