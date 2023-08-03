package days16;

public class Ex06 {

	public static void main(String[] args) {
		// Singleton pattern
		// 1. DBCP( DataBase Connection Pool )
		// 2. 객체 생성 제한  - 1개 객체 생성 
		//     첫 객체 생성 - 1개 객체 생성  , 두 번째 객체 생성 생성X , 세 번째 객체 생성
		
		
//		BoardDao dao1 = new BoardDao();
//		System.out.println(dao1.hashCode()); // 객체 고유 값
//		BoardDao dao2 = new BoardDao();
//		System.out.println(dao2.hashCode());
//		BoardDao dao3 = new BoardDao();
//		System.out.println(dao3.hashCode());
//		BoardDao dao4 = new BoardDao();
//		System.out.println(dao4.hashCode());
		
		BoardDao dao1 = BoardDao.getinstance();
		System.out.println(dao1.hashCode()); // 객체 고유 값
		BoardDao dao2 = BoardDao.getinstance();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = BoardDao.getinstance();
		System.out.println(dao3.hashCode());
		BoardDao dao4 = BoardDao.getinstance();
		System.out.println(dao4.hashCode());
		
		
		
		
	}//main

}//class

// 1개 객체만 생성
// 클래스 내부에서는 객체 생성을 할 수 있다.
class BoardDao{	
	private BoardDao() {
		
	}
	// 공유변수, 클래스변수 필드
	private static BoardDao boardDao = null;

	// 메서드 앞에 synchronized 붙이면 해당 메서는 [스레드]에 안전한 [동기화] 처리
	public synchronized static BoardDao getinstance() {
		if(boardDao == null) {
			boardDao = new BoardDao();
		}
		return boardDao;
		
	}
	
}