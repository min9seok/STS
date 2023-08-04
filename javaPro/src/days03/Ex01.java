package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오전 9:01:06
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		String name ="홍길동";
		System.out.printf("%s\n",name); //홍길동
		System.out.printf("[%s]\n",name); //[홍길동]
		System.out.printf("[%10s]\n",name); //[       홍길동] 우측정렬
		System.out.printf("[%-10s]\n",name); //[홍길동       ] 좌측정렬
						
		int n = 50;
		System.err.printf("%d\n",n); //50 10진수
		System.err.printf("%#o\n",n); //62 8진수 #(flag)= 062
		System.err.printf("%#x\n",n); //32 16진수 #(flag)=0x32
		
		double pi =3.141592;
		System.out.printf("%f\n",pi);
		System.out.printf("%.2f\n",pi); // 자동 반올림 처리.				
		System.out.printf("[%10.3f]\n",pi); // 자동 반올림 처리.
		
		int no = 1; // 0001
		System.out.printf("%d\n",no);
		System.out.printf("%4d\n",no);
		System.out.printf("%04d\n",no); // *** (기억)
		
	    System.out.printf("%d(%c)\n",65,65);
	    //java.util.MissingFormatArgumentException: Format specifier '%c'
	    System.out.printf("%d(%1$c)\n",65);
	}//main
}//class   
