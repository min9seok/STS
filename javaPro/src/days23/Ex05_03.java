package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex05_03 {

	public static void main(String[] args) {
		int []score = {80,95,50,85,45,65,10,100};

//		[2] int [] - > TreeSet 변환
//		Arrays.asList(T..배열); T 클래스를 뜻함 		
		// IntStream > int X Integer Stream 변환
		// Stream<Integer>
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());;
		TreeSet<Integer> ts = new TreeSet<Integer>(list);
//		[1]
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		for (int i = 0; i < score.length; i++) {
//			ts.add(score[i]);
//		}	
		
		// 1) 75보다 큰 점수를 얻어와서 출력
		// 지정한 값보다 큰 값의 객체들을 반환
//		System.out.println(ts.tailSet(75,false));
		NavigableSet<Integer> ss = ts.tailSet(75,false);
		System.out.println(ss);
		// 2) 50보다 작은 점수를 얻어와서 출력
//		System.out.println(ts.headSet(50,false));
		NavigableSet<Integer> ss2 = ts.headSet(50,false);
		System.out.println(ss2);
		// 3) 50~75 사이의 점수를 얻어와서 출력
//		System.out.println(ts.subSet(50,false,75,false));
		NavigableSet<Integer> ss3 = ts.subSet(50,false,75,false);
		System.out.println(ss3);
	}//main

}//class
