package days09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int money = 125760;
		int unit =50000; 
		boolean sw = false;
		int count =0; 
		while(unit>=1) {
			count = money / unit;
			System.out.printf("%d원 : %d개\n",unit,count);
			money %= unit;
			unit /= !sw?5:2;
			sw = !sw;
//			if(sw == false) {
//				unit = unit / 5;
//				sw =true;
//			}else {
//				unit = unit/ 2;
//				sw = false;
//			}
			
		}
		
		
	}//main
	
	
	
}
