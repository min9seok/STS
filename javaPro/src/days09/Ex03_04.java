package days09;

public class Ex03_04 {

	public static void main(String[] args) {

		String rrn ="970622-1144411";
//		rrn = rrn.replace("-", "");
		boolean checkSum =  checkRRN(rrn);
		if (checkSum) {
			System.err.println("올바른 주민등록번호");			
		}else {
			System.err.println("잘못된 주민등록번호");
		}
		
	}//main

	private static boolean checkRRN(String rrn) {
		int total = 0;
		int m[] = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for(int i = 0; i<=12; i++) {
			total += (rrn.charAt(i) - '0')*m[i];
		}		
	      int check = (11-total%11)%10;
	      check = check%10; // 11>1 , 10>0	      
	      int ㅍ = rrn.charAt(13) - '0';	      
	      return ㅍ == check;
	}

} // class


 





