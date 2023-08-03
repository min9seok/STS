package days04;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오후 12:28:20
 * @subject switch 분기문
 * @content for 반복문
 */
public class Ex05 {

	public static void main(String[] args) {
		int i;
		int sum =0;
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i+"+");		
			//System.out.println("홍길동");
		}
		System.out.println("="+sum);
	}//main

}//class
