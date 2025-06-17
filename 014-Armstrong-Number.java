
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        int x = scanner.nextInt();
        int original = x;
        int sum = 0;

        while (x > 0) {
            int last_digit = x % 10;
            sum = sum + (last_digit * last_digit * last_digit); 
            x = x / 10; 
        }

        if (sum == original) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

        scanner.close();
    }
}
