package days06;

/**
 * @author minseok
 * @date 2023. 7. 20. - 오후 4:56:37
 * @subject
 * @content
 */
public class Ex08_01 {

	public static void main(String[] args) {
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.print("------------------\n");		
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("------------------\n");
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=4-i; j++) {
				System.out.print("_");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("------------------\n");		
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("_");
			}
			for(int j =1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("------------------\n");
		for(int i =1; i<=3; i++) {
			for(int j =1; j<=3-i; j++) {
				System.out.print("_");
			}
			for(int j =1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("------------------\n");
//		1 1
//		2 3
//		3 5
//		4 3
//		5 1
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=Math.abs(3-i); j++) {											
				System.out.print("_");
			}
			if(i<=3) {
			for(int j =1; j<=Math.abs(2*i-1); j++) {
				System.out.print("*");			
			}
			}else {
				for(int j =1; j<=Math.abs(6-i); j++) {
					System.out.print("*");			
				}	
			}
//			if(i==4) {
//			for(int j =1; j<=6-i+1; j++) {
//				System.out.print("*");			
//			}
//			}else if (i==5) {
//				for(int j =1; j<=6-i; j++) {
//					System.out.print("*");
//			}			
//			}
			System.out.println();
		}
	}

}
