package days16;

public class Ex08 {

	public static void main(String[] args) {
		

	}//main

}//class

// 자바 ~~~albe 인터페이스
interface Movable{
	// 상수
	// 추상메서드
	// default 메서드
	// static 메서드
	void move(int x, int y); // public abstract 앞에 없어도 있는 것
	
}

interface Attackable{
	void Attack(Unit unit);
}
// 인터페이스끼리 상속 및 다중상속 가능
interface Fightalbe extends Attackable, Movable{
	// 추상메서드
}


abstract class Unit{
	int currentHP; // 현재 유닛의 체력
	int x;             // 유닛의 위치(x좌표)
	int y;             // 유닛의 위치(y좌표)
}

// 하늘 유닛
class AirUnit extends Unit{
	
}
// 지상 유닛
class GroundUnit extends Unit{
	
}
//군인
class Fighter implements Fightalbe{ // move  Attack
	@Override
    public void Attack(Unit unit){
			// 총,칼 공격 등등
}
	@Override
	public void move(int x, int y) {
			// 걷기
	}
}

// 수리가 가능한 유닛
// 상수, 추상메서드  X 
interface Repairable{}

class Tank extends GroundUnit implements Fightalbe, Repairable{
	@Override
     public void Attack(Unit unit){
			//포 쏘는 공격
}
	@Override
	public void move(int x, int y) {
			// 이동
	}
}

// SCV
// 수리 가능     : Reparirable 인터페이스를 구현한 클래스  Tank , SCV
// 수리 불가능   : Fighter

class SCV extends GroundUnit implements Repairable{
	
	SCV(){}
	
	// 건물 건설 메서드
	// 다른 유닛 수리 메서드
	void repair(Repairable unit) {
		if( unit instanceof Tank ) {
			// Tank 수리 코딩
		}else if(unit instanceof SCV ) {
			// SCV 수리 코딩
		}else if(unit instanceof DropShip) {
			// DropShip 수리 코딩
		}
	}	
}
// 탱크 군인 무기 등등 수송
class DropShip extends AirUnit implements Fightalbe , Repairable{
	@Override
	public void Attack(Unit unit) {
		
	}
	@Override
	public void move(int x, int y) {				
	}
}
