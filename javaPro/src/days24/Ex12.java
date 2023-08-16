package days24;

import java.util.ArrayList;

public class Ex12 {

	public static void main(String[] args) {
		// 와일드 카드
		FruitBox<Fruit> fruitBox = new FruitBox();
		FruitBox<Apple> appleBox = new FruitBox();
		FruitBox<Grape> grapeBox = new FruitBox();

//		Juice juice = Juicer.makeJuice(fruitBox);
//		juice = Juicer.makeJuice(appleBox);
//		juice = Juicer.makeJuice(grapeBox);

		// makeJuice 메서를 제네릭 메서드로 선언하면 호출방법이 다르다
		Juice juice = Juicer.<Apple>makeJuice(appleBox);
		// <Apple> 생략이 가능
//		Juice juice = Juicer.makeJuice(appleBox);
		
		
		// 제네릭 메서드
		// - 메서드의 선언부에 제네릭 타입이 선언된 메서드
		// - 형식 
		// public staic <T> juice makeJuice( FruitBox<T> box){
		//	}


	}//main

}//class
class Fruit {
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
class Box05<T>{
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
class FruitBox<T extends Fruit> extends Box05{
	// 구현
}

// 클래스 선언, 제네릭 클래스 X
// 매개변수 과일박스를 주면 쥬스를 만들어서 반환하는 기능의 쥬스 클래스
class Juice{}

//FruitBox<? extends Fruit> box) Fruit 물려받은 자식만 가능
//FruitBox<? super Fruit> box) Fruit 부모들 가능
//FruitBox<? box) 제한 없다. 모든 타입 가능

class Juicer{
	// 메서드 오버로딩 조건
	// 제네릭 타입 매개변수는 오버로딩이 성럽되지 않는다.
	//                              ? == 와일드 카드
//	static Juice makeJuice(FruitBox<? extends Fruit> box) {
//		return new Juice();
//	}
	// 제네릭 메서드 클래스에 있는 제네릭 과는 별개
	static <T extends Fruit> Juice makeJuice(FruitBox box) {
		return new Juice();
	}
	//	static Juice makeJuice(FruitBox<Fruit> box) {
	//		return new Juice();
	//	}	

}