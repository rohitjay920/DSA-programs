package recursion;

public class FibonacciRecursion {
	public static void main(String[] args) {
		int num = 6;
		System.out.println(fibonacci(num));
	}
	public static int fibonacci(int num) {
		if(num<2)
			return num;
		else
			return fibonacci(num-1) + fibonacci(num-2);
	}
}
