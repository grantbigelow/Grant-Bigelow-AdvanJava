
public class fibonacciApp {
	public long Fibonacci(int num) {
		long temp = 0;
		long temptwo = 1;
		long fib;
	
		for(int i = 0; i<num; i++) {
			fib = temp + temptwo;
			temp = temptwo;
			temptwo =fib;
		}
		return temp;
	}
}
