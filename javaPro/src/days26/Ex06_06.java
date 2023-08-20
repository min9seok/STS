package days26;

import java.io.File;
import java.util.Arrays;

public class Ex06_06 {

	public static void main(String[] args) {
		// days26\temp\temp_a\xxx
		String pathname = ".\\src\\days26\\temp";
		File dir = new File(pathname);

		if(dir.exists()) {
			//			System.out.println(dir.delete()); // 하위 디렉토리가 없어야 삭제 가능
			//			if(dir.isDirectory()) {
			//				File list [] = dir.listFiles();				
			//				for (int i = 0; i < list.length; i++) {
			//					File f = list[i];
			//					if( f.delete() ){
			//    					System.out.println(f.getName()+" 삭제성공");
			//    				}else{
			//    					System.out.println(f.getName()+" 삭제실패");
			//    				}
			//				}				
			//			}
//			deleteFolders(dir);
		}

	}//main
//		[3] 강사님 풀이
//	private static void directioryDelete(File f) {
//		while( !f.delete() ) {
//			File list[] = f.listFiles();
//			for (int i = 0; i < list.length; i++) {
//				if(list[i].delete()) {
//					System.out.printf("%s 삭제 완료\n",list[i]);
//				}else {
//					directioryDelete(list[i]);
//				}
//			}
//		}
//	}
	//	[2] 최상위 Temp 폴더삭제가 없음
	//	private static void deleteAll(File file) {
	//	      File[] files = file.listFiles();
	//	      for (int i = 0; i < files.length; i++) {
	//	         if(files[i].isDirectory()) {
	//	            deleteAll(files[i]);         
	//	         }
	//	         files[i].delete();
	//	      } // for
	//	   }
	//	[1] 정상 삭제
	//	   private static void deleteFolders(File dir) {
	//		      
	//		      File[] childList = dir.listFiles();
	//		      if (childList != null) {
	//		         for (int i = 0; i < childList.length; i++) {
	//		            File child = childList[i];
	//		            deleteFolders(child);         
	//		            System.out.printf("> %s 를 삭제했습니다.\n", child);
	//		         }
	//		      }
	//		      dir.delete();         
	//		   }


}//class