package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 3:26:35
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// Type mismatch: cannot convert from double to float
		// float pi = (float) 3.141592;
		float pi = 3.141592f;		
		//소수점 4번째 자리에서 반올림한 실수값을 얻어와서 출력..
		//[2]
		System.out.println(pi * 1000 + 0.5); //3141.592
		System.out.println( (int) (pi * 1000 + 0.5) ); //3141
		System.out.println( (int) (pi * 1000 + 0.5) /1000f ); //3.141
		
					
		//[1]
		//System.out.printf("%.3f",pi);
		
		//pi = Float.parseFloat(String.format("%.3f", pi));
		//System.out.println(pi);
	}//main

}//class
