package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\Java 팀 구성.txt";		
		ArrayList<MemberVO> teamList = null;		
		HashMap<String,ArrayList<MemberVO>> teamMap = new LinkedHashMap();		
		String line = "";
		String teamName ="";
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
						tName = tName.replace("(팀장)","");
						memberVO = new MemberVO(tName, "팀장");
					}else {
						memberVO = new MemberVO(tName, "팀원");
					}
					teamList.add(memberVO);
				}
				teamMap.put(teamName, teamList) ;				
			}	

			dispTeamMember( teamMap );
		}catch (Exception e) {
			e.printStackTrace();
		}


	}//main

	public static void dispTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> ir = eset.iterator();
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		int teamCount = 0;
		MemberVO teamLeaderVO = null;
		String teamLeaderName = null;
		while (ir.hasNext()) {
			Entry<String,ArrayList<MemberVO>> entry =  ir.next();
			teamName = entry.getKey();
			teamList = entry.getValue();
			teamCount = teamList.size();
			teamLeaderVO = teamList.get(0);
			teamLeaderName = teamLeaderVO.getName();			
			System.out.printf("[%s(%d명):%s]\n",teamName,teamCount,teamLeaderName);
//			teamList.subList(1, teamCount);
			Iterator<MemberVO> ir2 = teamList.iterator();
			int seq =1;
			if ( ir2.hasNext() ) ir2.next(); // 팀장 읽어와서 버림
			while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf(" [%d]%s\n",seq++,memberVO);
			}
		}
	}
}//class
