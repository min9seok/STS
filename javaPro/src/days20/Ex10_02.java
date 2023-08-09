package days20;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author user
 * MessageFormat
 * 특정형식 < 데이터(값) 출력
 *            > 데이터(값) 읽기
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String source ="이름:이준희, 나이:20, 성별:true";
		
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object objs[] = mf.parse(source);
			for (Object obj : objs) {
				System.out.println(obj);
			}
		} catch (ParseException e) {			
			e.printStackTrace();
		}
//		String output = MessageFormat.format(pattern,name,age,gender);
//		System.out.println(output);

		
		
		
	}//main
}//class



