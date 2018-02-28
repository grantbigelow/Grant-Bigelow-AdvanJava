import java.util.Scanner;

public class fibonacciMain {

	public static void main(String[] args) {
		fibonacciApp app = new fibonacciApp();
		Scanner oScan = new Scanner(System.in);
		System.out.print("Enter the fibonacci term: ");
		int num = oScan.nextInt();
		System.out.print(app.Fibonacci(num));

	}

}
