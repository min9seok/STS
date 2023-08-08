package days19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringJoiner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		String key = "user.dir";
		String userDir = System.getProperty(key);
//		System.out.println(userDir);
		String fileName = "Java 팀 구성.txt";
		String path = String.format("%s\\src\\days19\\%s", userDir,fileName);
//		System.out.println(path);
		String line = null;
		try(FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr)) {
			while((line = br.readLine())!=null  ) {
				if(line.equals("2조")) {
					line = br.readLine();
//					System.out.println(line);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		line = "박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영\r\n"
		String regex = "\\s*,\\s*";
		String teamMembers[] = line.split(regex);
//		System.out.println(Arrays.toString(teamMembers));
		String teamLeader = null;
		String teamMembers2[] = new String[teamMembers.length-1];
		for (int i = 0, j =0; i < teamMembers.length; i++) {
			if( teamMembers[i].contains("(팀장)")) {
				teamLeader = teamMembers[i].replace("(팀장)","");
				continue;
			}else {
				teamMembers2[j++] = teamMembers[i];
			}
		} //for
//		System.out.println("> teamLeader : " + teamLeader);		
		Arrays.sort(teamMembers2,Collections.reverseOrder());
//		Arrays.sort(teamMembers2,(n1,n2)-> n2.compareTo(n1));
//		System.out.println(Arrays.toString(teamMembers2));
//		String output = "<ul>";
//		 output += String.format("\r\n\t<li class=\"leader\">%s</li>",teamLeader);		
//		 output += "\r\n\t<li>"+String.join("</li>\r\n\t<li>", teamMembers2) + "</li>";
//		 output += "\r\n</ul>";
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>");
		sb.append(String.format("\r\n\t<li class=\"leader\">%s</li>",teamLeader));
		sb.append("\r\n\t<li>"+String.join("</li>\r\n\t<li>", teamMembers2) + "</li>");
		sb.append("\r\n</ul>");
		System.out.println(sb.toString());
		
//		StringJoiner sj = new StringJoiner("</li>\r\n\t<li>", "\t<li>","</li>");
//		sj.add();
		
	}//main
}//class
