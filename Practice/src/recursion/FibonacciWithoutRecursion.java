package recursion;

public class FibonacciWithoutRecursion {
	public static void main(String[] args) {
		int num = 6;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for(int i=2;i<=num;i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println(n3);
	}
}
