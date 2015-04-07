package hw2;

public class Main {

	public static void main(String[] args) {
		Stack simple = new Stack(5);
		
		simple.push("1");
		System.out.println(simple.pop());
		
		simple.push("2");
		System.out.println(simple.pop());
	}

}
