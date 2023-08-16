package days24;

/**
 * @author user
 * 제네릭 타입
 * 1) 제네릭 클래스
 * 2) 제네릭 메서드
 */
public class Ex08 {

	public static void main(String[] args) {
		// 제네릭 클래스
//		Box box1 = new Box();
//		box1.setItem(100);
//		box1.setItem("홍길동");
//		box1.setItem(3.14);
		// 형변환 사용 ...안해도 나오는데 왜 해야하는거지?
//		System.out.println(box1.getItem());
		
//		    String 대입된 타입
//		Box<String> box = new Box();
		
		// 자동 호환~
//		Box box = new Box();
//		box.item = "XXXX";
		
	}//main

}//class

// 제네릭 클래스
// 1) Box 원시타입(raw type)
// 2) T   타입변수,타입매개변수
// 3) Box<T> 제네릭클래스, T의Box
class Box<T>{
	T item;	
		public T getItem() {
			return item;
		}
	
		public void setItem(T item) {
			this.item = item;
		}
}

//class Box{
//	int item;
//
//	public int getItem() {
//		return item;
//	}
//
//	public void setItem(int item) {
//		this.item = item;
//	}
//}
//class Box{
//	String item;
//
//	public String getItem() {
//		return item;
//	}
//
//	public void setItem(String item) {
//		this.item = item;
//	}
//}
//class Box{
//	double item;
//
//	public double getItem() {
//		return item;
//	}
//
//	public void setItem(double item) {
//		this.item = item;
//	}
//}
//class Box{
//	Object item;
//
//	public Object getItem() {
//		return item;
//	}
//
//	public void setItem(Object item) {
//		this.item = item;
//	}
//}