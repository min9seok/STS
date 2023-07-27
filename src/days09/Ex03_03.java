package days09;

public class Ex03_03 {

	public static void main(String[] args) {
		//주민등록번호 (rrn)
		// 1.생년월일 :
		// 2.성별, 세기, 내국인/외국인
		// 3.세는나이, 만나이
		// 4.검증
		String rrn ="970622-1144411";
		rrn = rrn.replace("-", "");
		boolean checkSum =  checkRRN(rrn);
		if (checkSum) {
			System.err.println("올바른 주민등록번호");			
		}else {
			System.err.println("잘못된 주민등록번호");
		}
		
	}//main

//	private static boolean checkRRN(String rrn) {
//		int total = 0;
//		int ㄱ = rrn.charAt(0) - '0'; 
//		int ㄴ = rrn.charAt(1) - '0';
//		int ㄷ = rrn.charAt(2) - '0';
//		int ㄹ = rrn.charAt(3) - '0';
//		int ㅁ = rrn.charAt(4) - '0';
//		int ㅂ = rrn.charAt(5) - '0';
////		                         6 
//		int ㅅ = rrn.charAt(7) - '0';
//		int ㅇ = rrn.charAt(8) - '0';
//		int ㅈ = rrn.charAt(9) - '0';
//		int ㅊ = rrn.charAt(10) - '0';
//		int ㅋ = rrn.charAt(11) - '0';
//		int ㅌ = rrn.charAt(12) - '0';
////		int ㄴ = Integer.parseInt(rrn.substring(1,2));
//		total += ㄱ*2 + ㄴ*3 + ㄷ*4 + ㄹ*5 + ㅁ*6 + ㅂ*7 + ㅅ*8 + ㅇ*9 + ㅈ*2 + ㅊ*3 + ㅋ*4 + ㅌ*5;
//		System.out.println(total);
//	      int check = 11 - total % 11;
//	      if(check==10) check=0;
//	      else if( check==11) check=1;	      
//	      int ㅍ = rrn.charAt(13) - '0';	      
//	      return ㅍ == check;
//	}

	public static boolean checkRRN(String rrn) {		
		int len = rrn.length();
		int sum=0;
		int count=2;
		for(int i =0; i<len; i++) {
			
			sum = (count)*rrn.charAt(i);
			if(count==9) {
				count = 2;
			}
		}		
		System.out.println(sum);
		sum = (11-sum%11);
		int ㅍ = rrn.charAt(12) - '0';	    
		System.out.println(sum);
//		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		return sum==ㅍ;
	}
} // class


 





