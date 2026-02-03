package Common_Package;

public class RecursiveBacktrackingFibonacci {

	// Recursive Backtracking Fibonacci
	static int fib(int n) {
		// Base cases
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		// Backtracking recursive calls
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		int n = 7;
		System.out.println("Fibonacci(" + n + ") = " + fib(n));
	}
}
