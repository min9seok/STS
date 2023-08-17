package days25;

public class Ex02 {
	
	enum Direction { EAST, SOUTH, WEST, NORTH}
	
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		System.out.println(d1);
		System.out.println(d1.name()); // "EAST"
		System.out.println(d1.ordinal()); // 0 상수의 순서 
		
		Direction d2 = Direction.valueOf(d1.name());
		System.out.println(d2);
		
		switch (d2) {
		case EAST: // Direction 생략되고 상수만 적는다			
			break;
		case WEST:			
			break;
		case SOUTH:			
			break;
		case NORTH:			
			break;
		default:
			break;
		}
		
	}//main
}//class
