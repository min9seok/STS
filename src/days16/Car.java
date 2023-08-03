package days16;

public class Car {
	
	// 필드
	String name;
	String gearType; // 수동, 자동
	int door;
	// 엔진 필요
	private Engine engine = null;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	// 생성자
	Car(){
		// this.engine = new Engine(); // 3) 생성자 초기화
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}
	

}
