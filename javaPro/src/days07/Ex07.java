package days07;

import java.util.Iterator;

/**
 * @author minseok
 * @date 2023. 7. 21. - 오후 12:33:39
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 1. 1/2+2/3+3/4+ ... +8/9+9/10= ???
	     // 2. 1+2+4+7+11+16+22+29+37+48+58+69+81+94+108+123+139+156+174+191 = ??? 규칙적인 수열 20개 까지의 합
		int i,j,k;
		double sum=0;
		for(i =1; i<=9; i++) {
		sum += (double)i/(i+1);
		System.out.printf("%d/%d+",i,i+1);
		}
		System.out.printf("=%f\n",sum);
//		for(i=1,j=2,k=1;i<=9; j++) {
//		sum += (double)(k/j);
//		if(i<10) {
//		System.out.print(i==9?k+"/"+j:k+"/"+j+"+");
//		i++;
//		k++;
//		}else {
//			break;
//		}		
//		}
//		System.out.println("="+(double)sum);							
//System.out.println((double)1/2+2/3+3/4+4/5+5/6+6/7+7/8+8/9+9/10);
//	System.out.println((double)(1/2+2/3+3/4+4/5+5/6+6/7+7/8+8/9+9/10));
//		System.out.println((double)7/6+31/20+71/42+127/72+9/10);				                                              
//	System.out.println(4/4+8/8+12/12+16/16+(9/10));
	
//System.out.println(0.5+0.6+0.75+0.8+0.83+0.86+0.875+0.89+0.9);
//		for(i=1,j=1,k=0; i<=20; j+=k) {
//			sum += j;
//			i++;
//			k++;
//			System.out.print(i==21?j:j+"+"); 
//		}
//		System.out.println("="+sum);
	}

}
