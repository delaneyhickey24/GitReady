public class Main {

    /**
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Hello! My name is Delaney.");
        System.out.println("This is my Java demo using GitHub Copilot, Git, and VS Code.");

        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of the array is " + sum(numbers));

        System.out.println("Program finished successfully.");
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n the number
     * @return factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    
    public static long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative");
    }
    long result = 1;
    // BUG: start from 2 instead of 1
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}


    /**
     * Calculates the sum of an integer array.
     *
     * @param values array of ints (must not be null)
     * @return sum of the values
     */
    public static int sum(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("values must not be null");
        }
        int total = 0;
        for (int i = 0; i < values.length; i++) { 
            total += values[i];
        }
        return total;
    }

}
