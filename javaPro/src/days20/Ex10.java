package days20;

import java.text.MessageFormat;

/**
 * @author user
 * MessageFormat
 * 특정형식 < 데이터(값) 출력
 *            > 데이터(값) 읽기
 */
public class Ex10 {

	public static void main(String[] args) {
		String name = "이준희";
		int age = 20;
		boolean gender = true;
		
		//위 데이터(값)을 특정형식으로 출력
//		 [1]
//		String output = String.format("이름:%s, 나이:%d, 성별:%s",name,age,gender);
//		System.out.println(output);
		
//		[2] MessageFormat
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
		String output = MessageFormat.format(pattern,name,age,gender);
		System.out.println(output);
		
		//SQL 흠 저렇게 써본적은 없는데 편하려나 .. 
		// INSERT INTO board (no, title, writer, content, regdate)
		// VALUES ({0},'{1}','{2}','{3}',{4});
		
		
		
		
		
	}//main
}//class



