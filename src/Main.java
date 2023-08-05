public class Main {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Using memoization
    public static int fibonacciMemoization(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }

        if (n <= 1) {
            memo[n] = n;
        } else {
            memo[n] = fibonacciMemoization(n - 1, memo) + fibonacciMemoization(n - 2, memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci using recursion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println("\nFibonacci using memoization:");
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1; // Initialize memoization array
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciMemoization(i, memo) + " ");
        }
    }
}