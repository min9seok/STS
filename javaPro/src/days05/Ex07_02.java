package days05;

/**
 * @author minseok
 * @date 2023. 7. 19. - 오후 4:34:33
 * @subject while과 do~while 의 차이점 
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int i =10;
		while(i < 2) {
			System.out.println("A");
		}
		do {
			System.out.println("B");
		} while (i < 2); 
		
	}

}
