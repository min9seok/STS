package days20;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		//.개강일(2023.7.13 9:00:00)로 부터 오늘까지 지난 일수 계산을 하세요..
		// 복습문제 3번 +  Thread sleep 이용한 실시간 시간 찍기
		Date sday = new Date(2023-1900,7-1,13,9,0,0);
//		System.out.println(sDay.toLocaleString());
		Date today = new Date();
//		System.out.println(today.toLocaleString());
		
		dispDiffDays(sday,today);
		
//		System.out.println(sDay.getTime()); // 1689206400000
//		System.out.println(today.getTime()); // 1691546648427
		
//		long diff = today.getTime() - sDay.getTime();
//		int d = (int) (diff/(1000*60*60*24));
//		int h = (int) (diff/(1000*60*60));
//		int m = (int) (diff/(1000*60));
//		int s = (int) (diff/(1000));
//		int ms = (int) (diff);
//		int arr[] = {d,h,m,s,ms};
//		for(int i =0; i<arr.length; i++) {
//			if(i==0) {
//			System.out.print(arr[i]+"일");
//			}else if(i==1) {
//				System.out.print(arr[i]+"시간");
//			}else if(i==2) {
//				System.out.print(arr[i]+"분");
//			}else if(i==3) {
//				System.out.print(arr[i]+"초");
//			}else if(i==4) {
//				System.out.print(arr[i]+"밀리초");
//			}
//		}
//		System.out.println(diff+"ms");
//		System.out.println(diff/1000+"s");
//		System.out.println(diff/(1000*60)+"m");
//		System.out.println(diff/(1000*60*60)+"h");
//		System.out.println(diff/(1000*60*60*24)+"d");				
		
		
		

	}//main

	private static void dispDiffDays(Date sday, Date eday) {
		long diff = eday.getTime() - sday.getTime();
		long 몫 = diff/(1000*60*60*24);
		System.out.printf("%dd-",몫);
		diff %= (1000*60*60*24);
		
		몫 = diff/(1000*60*60);
		System.out.printf("%dh-",몫);
		diff %= (1000*60*60);
		
		몫 = diff/(1000*60);
		System.out.printf("%dm-",몫);
		diff %= (1000*60);
		
		몫 = diff/(1000);
		System.out.printf("%ds-",몫);
		diff %= (1000);
		몫 = diff/1;
		System.out.printf("%dms-\n",몫);
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} // 10ms 
		
		dispDiffDays(sday, new Date());
		
	}

}//class
