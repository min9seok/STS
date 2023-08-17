package days25;
public class TeamVO {
	private String name;
	private int totalNumber; // 조 인원
	private String leader; // 조 팀장
	// private MemberVO leader
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public TeamVO() {
		super();		
	}
	public TeamVO(String name, int totalNumber, String leader) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leader = leader;
	}
	@Override
	public String toString() {
		return String.format("[%s(%d명):%s]\n", this.name,this.totalNumber,this.leader);
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		TeamVO vo = (TeamVO)obj;
		return this.name.equals(vo.name);
	}
	
}
