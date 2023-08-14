package days22;

public class Ex08 {

	public static void main(String[] args) {
		// LinkedList 컬렉션 클래스 
		// 1. 배열 : 메모리상에 동일한 자료형으로 연속적으로 놓이게 한 것 
		// (1) 장점 - 읽기 성능이 가장 빠르다.
		// (2) 단점 - 배열크기 고정 , 삽입 삭제 번거로움
		// 2. 링크드리스트 비연속적
		// (1) ArrayList, Vector + [E]lement(요소)
		// (2) Node(노드)
		// 	   각 노드들은 연결되어져 있다.
		//	[Node]  [0x100]Node]    [0x200]Node]
		//   0x100     0x200          0x300
		// 중간에 들어가면 주소값만 바꿔주면 된다 
		// 단방향(앞에주소만참조) 환형 , 양방향(앞뒤로주소참조) 환형 링크드리스트
		// 환형 링크드리스트(마지막이 처음에 주소 참조)
		Node node1 = new Node();
		node1.value = 10;		
		Node node2 = new Node();
		node1.value = 20;
		node1.next = node2;
		Node node3 = new Node();
		node1.value = 30;
		node2.next = node3;
		Node node4 = new Node();
		node1.value = 40;
		node3.next = node4;
		
		// 노드2와 노드3 사이에 노드5를 삽입
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		
		// 노드3 삭제
//		node3.next =null;
		node5.next =node4;
		// 노드4 삭제
		node5.next = null;
		
		
		}//main	
}//class

class Node{
	int value; // 값
	Node next = null; // 다음 노드의 주소를 참조 필드
//	Node prev = null; // 이전 노드의 주소를 참조 필드
}