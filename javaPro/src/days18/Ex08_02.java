package days18;

public class Ex08_02 {

	public static void main(String[] args) {
		// 암기
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		String sep = System.getProperty("file.separator"); // "\\"
		
		
		String directory = "C:\\temp\\days09";
		String fileNmae = "Ex01.java";

		String path ;
		if(directory.endsWith(sep)) {
			path = directory +fileNmae;	
		}else {
			path = directory +"\\"+fileNmae;
		}
		
		System.out.println(path);
		// "C:\\temp\\days09\\Ex01.java"
	}//main

}//class
