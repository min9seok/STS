package days06;

/**
 * @author minseok
 * @date 2023. 7. 20. - 오후 3:41:27
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
		//		System.out.println("****");
		//		System.out.println("****");
		//		System.out.println("****");
		//		System.out.println("****");

		//		I=1 J=1,2,3,4 + 개행
		//		I=2 J=1,2,3,4 + 개행
		//		I=3 J=1,2,3,4 + 개행
		//		I=4 J=1,2,3,4 + 개행
		//		for(int I =1; I<=4; I++) { // 행 갯수
		////		 	System.out.println("****");
		////			* ㅌ 4 + 개행
		//			for(int j = 1; j<=4; j++) { // 열(별) 갯수
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		
		for(int i =1;i<=4;i++) {
			System.out.print(i==1?"*\n":i==2?"**\n":i==3?"***\n":i==4?"****":"\n");			
		}		
//		for(int k=1;k<=2;k++) {					
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int k=1;k<=3;k++) {					
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int k=1;k<=4;k++) {					
//			System.out.print("*");
//		}

		System.out.print("\n------------------\n");
//
		for(int i =4;i>=1;i--) {		
			System.out.print(i==4?"****\n":i==3?"***\n":i==2?"**\n":i==1?"*":"\n");			
		}		
//		System.out.println();
//		for(int k=3;k>=1;k--) {					
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int k=2;k>=1;k--) {					
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int k=1;k>=1;k--) {					
//			System.out.print("*");
//		}

		System.out.print("\n------------------\n");

		for(int i =1;i<=1;i++) {
			System.out.print("___*");			
		}
		System.out.println();
		for(int k=1;k<=2;k++) {
			if(k==1){
				System.out.print("__");
			}			
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=3;k++) {
			if(k==1){
				System.out.print("_");
			}			
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=4;k++) {					
			System.out.print("*");
		}

		System.out.print("\n------------------\n");

		for(int i =4;i>=1;i--) {
			System.out.print("*");	
		}
		System.out.println();
		for(int k=3;k>=1;k--) {	
			if(k==3) {
				System.out.print("_");
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=2;k>=1;k--) {
			if(k==2) {
				System.out.print("__");
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k>=1;k--) {
			if(k==1) {
				System.out.print("___");
			}
			System.out.print("*");
		}

		System.out.print("\n------------------\n");

		for(int i =1;i<=1;i++) {
			if(i==1) {
				System.out.print("__");		
			}
			System.out.print("*");			
		}
		System.out.println();
		for(int k=1;k<=3;k++) {
			if(k==1) {
				System.out.print("_");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=5;k++) {
			if(k==1) {
				System.out.print("");	
			}
			System.out.print("*");
		}

		System.out.print("\n------------------\n");

		for(int i =1;i<=1;i++) {
			if(i==1) {
				System.out.print("__");		
			}
			System.out.print("*");			
		}
		System.out.println();
		for(int k=1;k<=3;k++) {
			if(k==1) {
				System.out.print("_");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=5;k++) {
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=3;k++) {
			if(k==1) {
				System.out.print("_");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int i =1;i<=1;i++) {
			if(i==1) {
				System.out.print("__");		
			}
			System.out.print("*");			
		}
		System.out.println();

		System.out.print("\n------------------\n");

		for(int i =1;i<=1;i++) {			
			System.out.print("*");			
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("_");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("__");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("___");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("____");	
			}
			System.out.print("*");
		}

		System.out.print("\n------------------\n");

		for(int i =1;i<=1;i++) {		
			if(i==1) {
				System.out.print("____");	
			}
			System.out.print("*");			
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("___");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("__");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("_");	
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {			
			System.out.print("*");
		}

		System.out.print("\n------------------\n");

		for(int i =1;i<=2;i++) {
			if(i==1) {
				System.out.print("*___");
			}else {
				System.out.print("*");
			}			
		}
		System.out.println();
		for(int i =1;i<=2;i++) {
			if(i==1) {
				System.out.print("_*_");
			}else {
				System.out.print("*_");
			}			
		}
		System.out.println();
		for(int i =1;i<=1;i++) {
			System.out.print("__*__");			
		}
		System.out.println();
		for(int i =1;i<=2;i++) {
			if(i==1) {
				System.out.print("_*_");
			}else {
				System.out.print("*_");
			}			
		}
		System.out.println();
		for(int i =1;i<=2;i++) {
			if(i==1) {
				System.out.print("*___");
			}else {
				System.out.print("*");
			}			
		}

		System.out.print("\n------------------\n");

		for(int k=1;k<=5;k++) {
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=3;k++) {
			if(k==1) {
				System.out.print("_");
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=1;k++) {
			if(k==1) {
				System.out.print("__");
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=3;k++) {
			if(k==1) {
				System.out.print("_");
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1;k<=5;k++) {
			System.out.print("*");
		}
		System.out.println();

	}
}
