package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
//		int m[] = new Random().ints(30,0,10).sorted().toArray();
		int m[] = {0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 3, 3, 3, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9};
		System.out.println(Arrays.toString(m));
		
		for (int i = 0; i <= 9; i++) {
			int count=0;
			for (int j = 0; j < m.length; j++) {							
			if(m[j]==i) {
				count++;
			}
			} // for
			System.out.println(i+" - "+count);							
		} // for

	}

}
