package days02;

/**
 * @author minseok
 * @date 2023. 7. 14. - 오후 2:43:44
 * @subject
 * @content
 */
public class Ex12 {
	public static void main(String[] args) {
	//	byte b = 10; // [00001010]
		//자바는 유니코드 2byte 형태로 저장 
	//	char c = 'A'; //  [01000001]
		//ASCII 7bit 128문자, 확장 ASCII 8bit 256문자
		//encoding  'A' => 65변환
		//decoding  65 => 'A' 변환
		
		// char == '\u0000' ~ '\uffff'
		//16 진수 61 -> 10진수 ? 
	    char d = '\u0061';
	    System.out.println(d); // 'a' = 97, 'A'  = 65 대문자 - 소문자 = 32만큼의 정수차이 
		
		
	}//main
}//class
