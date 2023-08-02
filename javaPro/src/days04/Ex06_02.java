package days04;

/**
 * @author minseok
 * @date 2023. 7. 18. - 오후 2:18:04
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=1;i<=10;i++){
			sum += i;			
		System.out.printf(i==10?"%d":"%d+",i);
		}
		System.out.printf("=%d\n",sum);
	}

}
