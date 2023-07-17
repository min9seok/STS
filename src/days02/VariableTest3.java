package days02;

public class VariableTest3 {
	public static void main(String[] args) {
		//p37
		System.out.println("[ 교환 전 ]");
		int javaScore = 83;
		int pythonScore = 100;
		System.out.println("javaScore : " + javaScore);
		System.out.println("pythonScore : " + pythonScore);
		
		System.out.println("------------------");
		
		System.out.println("[ 교환 후 ]");
		int temp;
		temp = javaScore;
		javaScore = pythonScore;
		pythonScore = temp;
		System.out.println("javaScore : " + javaScore);
		System.out.println("pythonScore : " + pythonScore);
	}//main
}//class
