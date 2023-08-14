package days22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Predicate;

public class Ex03_03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박민석");
		list.add("유희진");
		list.add("고경림");
		list.add("임경재");
		list.add("이지현");
		list.add("김정주");
		list.add("김호영");
			
//		subtractOddList.removeIf(a -> a%2 == 1);
//		[출처] [Java/자바] - ArrayList.removeIf(predicate<? super E> filter)|작성자 주현
		list.removeIf(n ->((String) n).charAt(0)=='김');
		System.out.println(list);
		
	}//main
}//class

