package days04;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오후 2:18:04
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=1;i<=10;i++){
			sum += i;
			if(i<10) {
			System.out.print(i+"+");
//			System.out.printf("%d+",i);
			}else {
			System.out.print(i);
//			System.out.printf("%d",i);
			}
				
		}
		System.out.print("="+sum);
//		System.out.printf("=%d",sum);
	}

}
