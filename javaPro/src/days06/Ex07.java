package days06;

public class Ex07 {

	public static void main(String[] args) {
		// LG 공채 : 
		// [이름 붙은 반복문]
		// continue 이름;
		// break 이름;
		out:for (int i = 2; i <=9; i++) {
			in:for (int j = 1; j <=9; j++) {
				System.out.printf("%d*%d=%02d ",i,j,i*j);
				if(j == 5) {
					break out;
//					return; 중간이라면 다르지만 어차피 다 뺼거라면 리턴이 효과적일듯..
				}
			} // for
			System.out.println();
		} // for
		
		

	}

}
