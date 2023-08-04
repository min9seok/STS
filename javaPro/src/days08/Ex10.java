package days08;

public class Ex10 {

	public static void main(String[] args) {
		//신용카드
		String card="7655-8988-9234-5677";
		String regex = "-";
		String  cardArr[] = card.split(regex);
		int index = (int) (Math.random()*4);
		cardArr[index] = "****";
		
//		String printCard = String.format("%s-%s-%s-%s",cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		String printCard = String.join(regex, cardArr); // String.join(구분자기준으로변경,변경할대상);
		System.out.println(printCard);
		
		
		
//		7655-****-9234-5677
//		7655-8988-9234-****
//		****-8988-9234-5677
//		7655-8988-****-5677
		
//		String card1[] = new String[3];
//		card1[0] = "7655";
//		card1[1] = "8988";
//		card1[2] = "9234";
//		card1[3] = "5677";

	}//main

}
