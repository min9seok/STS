package days05;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오후 3:12:44
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
//		조건문 : if
//		분기문 ㅣ switch
//		반복문 : for ,   안한 것  foreach(확장 for문)
//		기타 : break, continue
//		조건반복문  오늘 할 것  while , do~while
		
//		[컬렉션(collection)]    [열거자] 반복해서 처리
//		while (en.hasMoreElements()) {
//			type type = (type) en.nextElement();
//			
//		}
		
//		[반복자] 반복해서 처리
//		while (it.hasNext()) {
//			type type = (type) it.next();
//			
//		}
		
//		while (condition) {
//			 조건식이 참일 동안 반복해서 {} 블럭 실행.
//		}
		
//		for 반복문과 while 조건반복문의 차이점
//		   반복횟수        반복조건
		
//		 [1 ~10까지 합 (while문) ]
//		[1]
//		int i =1, sum=0;
//		while(i <= 10) {
//			System.out.print(i==10?i+"=":i+"+");
//			sum += i;		
//			i++;
//		}
//		System.out.println(sum);
//	    [2] 원햇던 해답
		int i =0, sum=0;
		while(++i <= 10) {
			System.out.printf("%d+",i);			
			sum +=i;			
		}
//		[2-1] 내가 푼 식
//		int i =0, sum=0;
//		while( i < 10) {
//			++i;
//			System.out.printf("%d+",i);			
//			sum +=i;			
//		}
//		[2-2] 다른사람이 푼 식
//		int i =0, sum=0;
//		while( i < 10) {
//		if(i==0){
//		i++;
//	 continue;	
//	}
//			i++;
//			System.out.printf("%d+",i);			
//			sum +=i;			
//		}		
		System.out.printf("=%d\n",sum);
	}

}
