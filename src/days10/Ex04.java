package days10;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		int m[] = {3,5,2,4,1,};
		System.out.println(Arrays.toString(m));
		
		// [추가(append)] 위치 마지막
		// [삽입(insert)] 위치 상관 x
		// [3,5,100,2,4,1]
		int index =2;
		int n =100;
		int temp[] = new int[m.length+1];
//		[1]
		System.arraycopy(m,0,temp,0,index);
		temp[index]=n;
		System.arraycopy(m,index,temp,index+1,m.length-2);
		
//		[2]
//		for (int i = 0; i < m.length; i++) {
//			if(index>i) {
//				temp[i] =m[i];
//			}else if(index<=i) {
//				temp[i+1] =m[i];
//			}
//			temp[index]=n;
//		} // for
		
		m = temp;
		System.out.println(Arrays.toString(m));
		
		
		

	}

}
