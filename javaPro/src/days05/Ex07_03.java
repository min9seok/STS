package days05;

public class Ex07_03 {

	public static void main(String[] args) {
//		조건문 if
//		분기문 switch
//		반목문 for   [foreach] 배열, 컬렉션 반복처리를 위한 반복문
//		조건반목문 while do~while
//		기타 break,continue
		
//		1.정수 10개 저장할 배열 m을 선언
		int m[] = new int[10];
		
//		2. 임의의 정수 (1~100)을 각 배열의 요소에 저장
//		1 <= (int)(Math.random()*100)+1 < 101
//		m[0] = (int)(Math.random()*100)+1;
//		m[1] = (int)(Math.random()*100)+1;
//		m[2] = (int)(Math.random()*100)+1;
//		m[3] = (int)(Math.random()*100)+1;
//		m[4] = (int)(Math.random()*100)+1;
//		m[5] = (int)(Math.random()*100)+1;
//		m[6] = (int)(Math.random()*100)+1;
//		m[7] = (int)(Math.random()*100)+1;
//		m[8] = (int)(Math.random()*100)+1;
//		m[9] = (int)(Math.random()*100)+1;
		for(int i =0; i < m.length; i++) {
			m[i] = (int)(Math.random()*100)+1;
		}
		
//		3. for문을 사용해서 각 요소를 출력.		
//		for(int i =0; i < m.length; i++) {
//			System.out.printf("m[%d]=%d\n",i,m[i]);
//		}
		
//		[foreach 문 사용해서 출력]
		for (int n : m) {
		System.out.println(n);
		}
	}

}
