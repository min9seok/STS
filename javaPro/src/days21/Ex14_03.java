package days21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex14_03 {

	public static void main(String[] args) {

		ArrayList team1 = new ArrayList();
		String t1 ="이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준";
		t1 = t1.replace("(팀장)","");
		String t1Arr[] = t1.split("\\s*,\\s*");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		}
		
		System.out.println(team1);

		ArrayList team2 = new ArrayList();
		team2.add("박민석");
		team2.add("유희진");
		team2.add("고경림");
		
		ArrayList team3 = new ArrayList();
		team3.add("박정호");
		team3.add("이상문");
		team3.add("이주영");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		System.out.println(class5);
		
		Iterator ir =class5.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
		}
		System.out.println(class5.containsAll(team1));

		ArrayList class5Clone = (ArrayList)class5.clone();
		class5Clone.removeAll(team1);
		 
		System.out.println(class5Clone);
//		Arrays.sort(null);
//		Collections.sort(class5Clone);
//		Collections.reverse(class5Clone);
//		class5Clone.sort(Comparator.naturalOrder());
//		class5Clone.sort(Comparator.reverseOrder());
//		class5Clone.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(class5Clone);
		
		
	}//main

}//class



