package days23;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex01 {

	public static void main(String[] args){
		// 복습문제 2번 로또 
		int n = 5; // Scanner 대용 로또 게임 횟수
		// 제네릭 <> 안 클래스타입은 그것만 선언하겟단 의미
		LinkedHashSet<Integer> lotto =null;
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>();
		int lottonumber = 0;
		for (int i = 0; i < n; i++) {
			lotto = new LinkedHashSet<>();			
			while (lotto.size() < 6 ) {
				lottonumber = (int)(Math.random()*45+1);
				lotto.add(lottonumber);				
			}			
			lottos.add(lotto);		
		}		
		ArrayList<Integer> slist = null;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		int no =1;
		while (ir.hasNext()) {
			 lotto = ir.next();
			 slist = new ArrayList<Integer>(lotto);
			 Collections.sort(slist);
			 Iterator<Integer> ir2 = slist.iterator();
			 System.out.printf("%d게임 : ",no++);
			 while (ir2.hasNext()) {
				 lottonumber = ir2.next();				 
				System.out.printf("[%02d]",lottonumber);
			}
			 System.out.println();
		}
		
	} // main

} // class
