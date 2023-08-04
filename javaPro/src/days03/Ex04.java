package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 12:16:43
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		int n =10;		
		System.out.printf("%s\n",Integer.toString(n,2));
		System.out.printf("%s\n",Integer.toBinaryString(n));
		String s ="" , s2 ="";
		 for (int i = 0; i < Integer.numberOfLeadingZeros(n); i++) s += "0"; // 0을 빈자리 개수만큼 만들어 전진 배치
		    s += Integer.toBinaryString(n); // 10진수를 2진수화하여 합치기
		System.out.println(s);
		
		
	}//main
}//class
