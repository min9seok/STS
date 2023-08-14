package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex04 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		// 1) a   b 합집합 1 2 3 4 5 6 7 8
		HashSet<Integer> hab = new HashSet<Integer>();
		hab.addAll(a);
		hab.addAll(b);
		System.out.println(hab);
		
//		ArrayList<Integer> hab = new ArrayList<Integer>();
//		hab.addAll(a);
//        Iterator<Integer> ir = b.iterator();
//        while (ir.hasNext()) {
//			Integer i = ir.next();
//			if(!a.contains(i)) {
//				hab.add(i);
//			}
//			
//		}
//        System.out.println(hab);
		
		// 2) a   b 차집합 1 2 3
		HashSet<Integer> cha = new HashSet<Integer>(a);
//		Iterator<Integer> ir = a.iterator();
//		while (ir.hasNext()) {
//			Integer i = ir.next();
//			if(!b.contains(i)) {
//				cha.add(i);
//			}
//		}
//		Iterator<Integer> ir = cha.iterator();
//		while (ir.hasNext()) {
//			Integer i = ir.next();
//			if(b.contains(i)) {
//				cha.remove(i);
//			}
//		}
		cha.removeAll(b);
		System.out.println(cha);
		// 3) a   b 교집합 4 5
		HashSet<Integer> kyo = new HashSet<Integer>();
		kyo.addAll(a);
		kyo.removeAll(cha);
//		kyo.addAll(b);
//		kyo.retainAll(a);
//		kyo.retainAll(b);
		System.out.println(kyo);
	}//main
}//class
