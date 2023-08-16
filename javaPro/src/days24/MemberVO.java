package days24;

public class MemberVO { // VO = Value Object 
	private String name;
	private String position; // 팀장 팀원
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public MemberVO() {
		super();	
	}
	public MemberVO(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	@Override
	public String toString() {
		return name + "("+position+")";
	}
	
	
	
}//class
