package days01;

/**
 * @author minseok
 * @date 2023. 7. 13. - 오후 4:46:55
 * @subject
 * @content Ex04_02 문제 안보고 타이핑 실습
 *                문자열과 변수 함께 사용 및 printf 사용
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String name = "박민석";
		int age = 27;
		age = age - 1;
		System.out.println(name);
		System.out.println(age);
		System.out.println("이름은 " + '"' + name + '"' + "이고, 나이는 " + "'" + age + "'" + "살입니다.");
		//System.out.println("이름은 \"" + name + "\"이고, 나이는 \'" + age + "\'살입니다.");
		//System.out.println("이름은 \"" + name + "\"이고,\n 나이는 \'" + age + "\'살입니다.");
//이름은 "박민석"이고 나이는 '27'살입니다.
		System.out.printf("이름은 \"%s\"이고 나이는 '%d'살입니다.",name,age);
		// format ==출력형식
		// 복사기능 컨트롤 알트 아래방향키
	} // main

}// class
