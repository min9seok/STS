package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

import days24.MemberVO;

public class Ex01 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\Java 팀 구성.txt";		
		ArrayList<MemberVO> teamList = null;		
		HashMap<TeamVO,ArrayList<MemberVO>> teamMap = new LinkedHashMap();		
		String line = "";
		String teamName ="";
		int teamTotalNumber = 0;
		String teamLeaderName ="";
		TeamVO teamVO = null;
		MemberVO memberVO = null;
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)){
			while((line = br.readLine())!=null && !line.equals("") ) {				 
				teamName = line;
				line = br.readLine();
				String tNames[] = line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				for (String tName : tNames) {
					if(tName.contains("(팀장)")) {
						teamLeaderName = tName = tName.replace("(팀장)","");
						memberVO = new MemberVO(tName, "팀장");
					}else {
						memberVO = new MemberVO(tName, "팀원");
					}
					teamList.add(memberVO);
				}
				teamTotalNumber = teamList.size();
				teamVO = new TeamVO(teamName,teamTotalNumber, teamLeaderName);
				teamMap.put(teamVO, teamList) ;				
			}	

			// key 중복으로 팀명이 같으면 key가 중복된다는 예외처리 필요
			if(!teamMap.containsKey(teamVO)) {			
			teamVO = new TeamVO("1조",1,"홍길동");
			teamList = null;
			teamMap.put(teamVO, teamList);			
			}else {
				System.out.println(">> 1조는 key 중복입니다.");
				
			}
			dispTeamMember( teamMap );
		}catch (Exception e) {
			e.printStackTrace();
		}


	}//main

	public static void dispTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
		Set<Entry<TeamVO, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir = eset.iterator();
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		int teamCount = 0;
		MemberVO teamLeaderVO = null;
		String teamLeaderName = null;
		TeamVO teamVO = null;
		while (ir.hasNext()) {
			Entry<TeamVO,ArrayList<MemberVO>> entry =  ir.next();
			teamVO = entry.getKey();
			teamList = entry.getValue();									
			System.out.printf("%s",teamVO);
			
//			if(teamList != null) {
//				Iterator<MemberVO> ir2 = teamList.iterator();
//				int seq =1;
//				if ( ir2.hasNext() ) ir2.next(); 
//				while (ir2.hasNext()) {
//					MemberVO memberVO = ir2.next();
//					System.out.printf(" [%d]%s\n",seq++,memberVO.getName());
//				}
//			}else {
//				System.out.println("팀원이 존재하지 않습니다.");
//			}
			try {
				Iterator<MemberVO> ir2 = teamList.iterator();
				int seq =1;
				if ( ir2.hasNext() ) ir2.next(); 
				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
					System.out.printf(" [%d]%s\n",seq++,memberVO.getName());
				}
			} catch (NullPointerException e) {
				System.out.println("팀원이 존재하지 않습니다.");
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		}
	}
}//class
