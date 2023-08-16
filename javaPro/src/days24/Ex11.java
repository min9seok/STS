package days24;

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		// 제한된 제네릭 클래스
		// 모든 타입이 아니라 과일 타입 제한해서
//		FruitBox<Fruit> box1 = new FruitBox();
//		FruitBox<Apple> box2 = new FruitBox();
//		FruitBox<Grape> box3 = new FruitBox();
		
		// FruitBox 에는 과일만
//		Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>
//		FruitBox<Toy> box4 = new FruitBox();
		
	}//main

}//class
/*
interface Eatable{
}
class Fruit implements Eatable{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}	
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}	
}
class Toy {
	public String toString() {
		return "Toy";
	}	
}
// 상자(Box04) 제네릭 클래스
class Box04<T>{
	ArrayList<T> list = new ArrayList();
	void add(T item) { 
		this.list.add(item);
	}
	int size() {
		return this.list.size();
	}
	T get(int i) {
		return this.list.get(i);
	}
	public String toString() {
		return this.list.toString();
	}
}
// 과일만 담을 수 있는 제네릭 클래스로 제한해서 선언
// Fruit 클래스의 자식클래스이고 Eatable 인터페이스도 구현한 클래스 
class FruitBox<T extends Fruit & Eatable> extends Box04{
	// 필드 추가 선언
	// 재정의함수
}
*/