package days19;

import java.util.Arrays;

/**
 * @author user
 * 18일 복습 5번문제 프로그래머스
 */
public class Ex02 {

	public static void main(String[] args) {
		
		String my_str = "abc1Addfggg4556b";
		int n =6;
		String answer[] = Solution.solution(my_str,n);
		System.out.println(Arrays.toString(answer));
//		String my_str = "abcdef123";
//		int n =3;
	}//main
}//class
class Solution {
    public static String[] solution(String my_str, int n) {
//    	int answerlength = (my_str.length())/n; 
    	int answerlength = (int) Math.ceil((double)my_str.length()/n);
    	String[] answer = new String[answerlength];
    	int beginIndex=0 , endIndex;
    	String str = null;
    	int my_strlength = my_str.length();
    	int index=0;
    	while(index != answerlength) {
    		endIndex = beginIndex+n;    		
    		if(endIndex > my_strlength) {
    			endIndex = my_strlength;
    		}    		
    		str = my_str.substring(beginIndex,endIndex);
    		answer[index++] = str;
    		beginIndex = endIndex;
    	}
//    	String a = my_str.substring(0,6);
//    	System.out.println(a);
//    	a = my_str.substring(6,12);
//    	System.out.println(a);
//    	a = my_str.substring(12,16);
//    	System.out.println(a);
		return answer;
    } 
}

/* try catch로 예외 처리 하여 코딩을 줄인 것 
int i = 0, idx = 0;
try {
   for (             ; i < my_strLength ; i+=n, idx++) {
       answer[idx] =   my_str.substring(i, i+n );
     } 
} catch (Exception e) {
   answer[idx] =   my_str.substring(i);
}
*/

//while 보다 실행환경에서 밀림 
//class Solution {
//    public String[] solution(String my_str, int n) {
//        int cnt = (my_str.length()+n-1) /n;
//        String[] answer = new String[cnt];
//        for(int i=0; i<cnt; i++){
//            int start = n*i;
//            int end = 0;
//            if(start+n>=my_str.length()){
//                end = my_str.length();
//            }else{
//                end = start+n;
//            }
//            answer[i] = my_str.substring(start,end);
//        }
//        return answer;
//    }
//}