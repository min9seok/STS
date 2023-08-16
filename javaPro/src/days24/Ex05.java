package days24;

import java.util.concurrent.CancellationException;
import javax.swing.ButtonModel;

/**
 * @author user 
 * 중첩 인터페이스
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Button btnTouch = new Button();
		btnTouch.setOnClickListener(new CollListener());
		btnTouch.touch();
		
		btnTouch.setOnClickListener(new MessageListener());
		btnTouch.touch();

	}//main

}//class
class Button{
	// 필드
	OnClickListener listener;
	// 생성자 , setter 의존성 주입(DI)
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		this.listener.onClick();
	}
	// 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}	
}
class CollListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 건다.");		
	}	
}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {		
		System.out.println("메시지를 보낸다.");
	}
	
}