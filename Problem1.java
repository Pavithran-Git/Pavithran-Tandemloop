package problem1;
//Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
//Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
//Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
public class Problem1 {
	
	static double a = 5.0;
	static double b = 4.5;
	static String operation = "Multiply";
	
	public static void calculator() {
		switch(operation) {
		case "Addition":
			System.out.println("Addition : "+ (a + b));
			break;
		case "Subtraction":
			System.out.println("Subtraction : "+ (a - b));
			break;
		case "Multiply":
			System.out.println("Multiply : "+ (a * b));
			break;
		case "Division":
			if(b !=0) {
				System.out.println("Division : "+ (a / b));
			} else {
				System.out.println("Can't divide by zero");
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		calculator();
	}
}
