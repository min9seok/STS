package days16;

// unchecked 예외
// 0 ~100 아니면 사용자가 정의한 예외 발생
public class ScoreOutOfBoundException extends RuntimeException {

	// 예외 코드번호 필드
	private final int ERROR_CODE;
	
	public int getERROR_CODE() {
		return ERROR_CODE;
	}
	public ScoreOutOfBoundException(String message) {
		this(1000, message);
	}
	public ScoreOutOfBoundException(int eRROR_CODE, String message) {
		super(message);
		ERROR_CODE = eRROR_CODE;
	}
	
}
