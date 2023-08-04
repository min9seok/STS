package days08;

/**
 * @author minseok
 * @date 2023. 7. 24. - 오후 12:21:05
 * @subject 시험문제  재귀함수(tree 구조 검색시 주로 사용)
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int n =10;
		int result = sum(n);
		System.out.printf("1~%d=%d\n",n,result);
		// 1~n 합 일반 합수
		// 1~n 합 재귀 합수
		result = recuresiveSum(n);
		System.out.printf("1~%d=%d\n",n,result);

	}//main
//	재귀함수
	private static int recuresiveSum(int n) {
		if(n==1) {
			return n;	
		}else {
			return n + recuresiveSum(n-1); 
		}
		
	}
	private static int sum(int n) {
		int result=0;
		for (int i = 0; i <=n; i++) {
			result +=i;			
		}
		return result;
	}

}
