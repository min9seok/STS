package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex06_02 {

	public static void main(String[] args) {
		// 2) ArrayList -> String [] 변환
		ArrayList list = new ArrayList();
		list.add("신종혁");
		list.add("고경림");
		list.add("이재영");
//		[1]
//		String nameArr[] = new String[list.size()];
//		Iterator ir = list.iterator();
//		int index = 0;
//		while (ir.hasNext()) {
//			String name = (String) ir.next();
//			nameArr[index++] = name;
//		}
//		System.out.println(Arrays.toString(nameArr));
//		[2] Object[] > String[] 형변환
//		String nameArr[] = (String[])list.toArray(new String[list.size()]);
		String []nameArr = (String[]) list.toArray();
		System.out.println(Arrays.toString(nameArr));
//		[3]
//		String nameArr[] = new String[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			nameArr[i]= (String)list.get(i);
//		}
//		System.out.println(Arrays.toString(nameArr));
		
	}//main
}//class
