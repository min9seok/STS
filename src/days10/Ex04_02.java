package days10;

import java.util.Arrays;

public class Ex04_02 {

	public static void main(String[] args) {
		int m[] = {3,5,2,4,1,};
		System.out.println(Arrays.toString(m));
		// 추가
		// 삽입
		// 수정
//		int index =2;
//		m[2] = 100;
		//삭제
		int index =2;
		// [3,5,4,1]
		int temp[] =  new int[m.length-1];
		System.arraycopy(m, 0, temp, 0, index);
		for (int i = 3; i < m.length; i++) {
			temp[index++] = m[i];
		} // for
//		System.arraycopy(m, 3, temp, 2, m.length-3);
		m=temp;		
		System.out.println(Arrays.toString(m));
		
		
		

	}

}
