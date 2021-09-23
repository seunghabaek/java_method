import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	
	public static void main(String[] args) throws IOException {
		
//		// 100000000 lines...
//		printTwoTimesA(); // use method - use refactor: same result but more efficient
//		// 100000000 lines....
//		printTwoTimesA();
//		// 100000000 lines....
//		printTwoTimesA();
//		printTwoTimesB();
		
		// 입력값에 따라 다르게 만들기 
					// argument
		printTwoTimes("a", "-"); 
		System.out.println(twoTimes("a", "-"));
		writeTwoTimes("a", "*");
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		

	}
	public static String twoTimes(String text, String delimeter) {
		String out = "";
		out = out + delimeter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
									// 매개변수, parameter
	public static void printTwoTimes(String text, String delimeter) { // make method
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

	public static void writeTwoTimes(String text, String delimeter) throws IOException { // make method
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimeter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
	}
}
