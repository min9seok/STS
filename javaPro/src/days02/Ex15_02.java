package days02;

public class Ex15_02 {
	public static void main(String[] args) {
		int i = 10;
		// int -> String
		// 10 -> "10" 형변환
		
		
		//String si = i + "";
		//System.out.println(si);
		
		String si = String.valueOf(i);       
		System.out.println(si);
        
       si = Integer.toString(i);
        System.out.println(si);
        
       si =  Integer.toBinaryString(i);
       si = Integer.toString(i,2);
        System.out.println(si);
        
        si =  Integer.toOctalString(i);
        si = Integer.toString(i,8);
        System.out.println(si);

        si =  Integer.toHexString(i);
        si = Integer.toString(i,16);
        System.out.println(si);
        
  
        
	}//main
}//class
