import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Factorial: ");
        int x = scanner.nextInt();
        int result = factorial(x);
        System.out.println("Factorial of " + x + " is: " + result);
        scanner.close();
    }

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}

