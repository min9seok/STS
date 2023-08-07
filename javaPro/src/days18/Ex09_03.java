package days18;

public class Ex09_03 {

	public static void main(String[] args) {
		  
//		testString();             // > String 처리 시간 : 3807964500ns
		testStringBuffer();  // > StringBuffer 처리 시간 : 6216800ns
		 
		
	}//main
	// String
	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for(int i = 0; i <200000; i++) {
			s += "a";
		}
		long end = System.nanoTime();
		System.out.printf("> String 처리 시간 : %dns\n",(end-start));
	}
	// StringBuffer
	private static void testStringBuffer() {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("a");
		for(int i = 0; i <200000; i++) {
			sb.append("a");
		}
		long end = System.nanoTime();
		System.out.printf("> StringBuffer 처리 시간 : %dns\n",(end-start));	
	}
}//class
