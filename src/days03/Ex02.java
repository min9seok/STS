package days03;

//import java.util.Calendar;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오전 11:30:56
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		//java.util.IllegalFormatConversionException: d != java.lang.String
		// System.out.printf("%d\n","홍길동");
		
		 //Calendar c = Calendar.getInstance();
		   //String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
		   //System.out.printf("%1$tm %1$te %1$tY\n",c); //보통 e보다 d를 쓴다 01 02 로 입력받기 때문에
		   // %[argument_index$][flags][width][.precision]conversion
		   //System.out.printf("%(d\n",-123); //음수는 ()만듬
		   //System.out.printf("%,d\n",12323123); // 표준 자리수 , 나눠준다
	}//main
}//class
