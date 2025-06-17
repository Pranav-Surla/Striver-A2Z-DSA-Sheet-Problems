import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        System.out.println("Divisors of " + x + " are:");

        for (int i = 1; i <= x/2; i++) {
            if (x % i == 0) {
                System.out.println(i + " is a divisor of " + x);
            }  
        }System.out.println(x + " is a divisor of " + x);

        scanner.close();
    }
}
