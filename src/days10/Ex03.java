package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author minseok
 * @date 2023. 7. 26. - 오전 11:16:42
 * @subject 배열 단점 > 컬렉션 클래스
 * @content 1) 배열크기 고정(자동 증가/감소 X) 
 */
public class Ex03  {
	
	static int index =0; // class전역 변수
	static Scanner scanner = new Scanner(System.in);
	static char con ='y';
	
	public static void main(String[] args) throws IOException {

		int m[] = new int[3];
				
		String menus[] = {"추가","수정","삭제","검색","조회","종료"};
		
		int selectedNumber;
		
		while(true) {
			dispMenus(menus);
			selectedNumber = selectMenus(scanner);
			processMenus(selectedNumber,m);
		}
		
	}//main

	public static void processMenus(int selectedNumber, int m[]) throws IOException {
		switch (selectedNumber) {
		case 1: // main.m 배열에 값을 입력받아서 요소 추가
			add(m);
			break;
		case 2:	
			System.out.println("배열에 요소 수정");
			break;
		case 3:	
			System.out.println("배열에 요소 삭제");
			break;
		case 4:	
			System.out.println("배열에 요소 검색");
			break;
		case 5:	//모든 요소 조회
			list(m);
			break;
		case 6:		
			exit();
			break;
		}
		일시정지();
	}
	public static void 일시정지() {
		System.out.print("> 아무키나 누르면 계속합니다.");
		// 예외 처리 방법 2가지 : try-catch , throws
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {		
			e.printStackTrace();
		}		
	}
	public static int[] plus(int[] m , int temp) {
//		int temp[] = new int [m.length+1];
		int[] newArray = Arrays.copyOf(m, temp);		
//		System.arraycopy(m, 0, temp, 0, m.length);		
		return newArray;
	}
	private static void list(int[] m) {
		System.out.println("[5. 조회]");
		if(index==0) {
		System.out.print(" 추가 된 요소가 없습니다. ");		
//		return; 함수를 빠져나감 , 그러나 굳이 지금 쓸 이유는 없음(for문과 조건이 같기때문) 
		}
		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d ",i,m[i]);			
		} // for		
		System.out.println();
	}

	// m 배열에 요소를  추가하는 함수(메서드)
	public static void add(int[] m) throws IOException  {
		System.out.println("[1. 추가]");
		do {
			if(index ==m.length) {
				m = plus(m,6);
			}
			System.out.printf("> 정수입력 ?");
			int n = scanner.nextInt();			
			m[index++] = n;
			System.out.print("\t 요소추가 계속할거냐? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
//		} while (Character.toUpperCase(con)=='Y' && index <m.length);
		
		System.out.println(Arrays.toString(m));
	}

	public static void exit() {
		System.out.println("\n\n 프로그램 종료합니다.~");		
		System.exit(-1);
	}

	public static int selectMenus(Scanner scanner) {
		System.out.print("> 메뉴 선택하세요? ");
		return scanner.nextInt();
		
	}

	public static void dispMenus(String[] menus) {
		System.out.println("[메뉴]");;
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t",i+1,menus[i]);
		} // for
		System.out.println();
	}

}
