package days14;

public class Car {

		//필드
		String name;
		String gearType;
		int door;
		
		private Engine engine;
public Engine getEngine() {
			return engine;
		}
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		//		Engine engine = new Engine();
		{
//			this.engine = new Engine();	
		}
		//생성자
		Car(){
//		this.engine = new Engine();
		}
		public Car(Engine engine2) {
			this.engine = engine;
		}
	//메서드	
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
