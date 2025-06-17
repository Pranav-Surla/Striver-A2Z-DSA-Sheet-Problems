import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        System.out.print("Enter a Number: ");
        x = scanner.nextInt();
        scanner.close();

        if (x < 2) {
            System.out.println("It is not a Prime Number");
            return; 
        }
        int count = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                count++;
                if (i != x / i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("It is not a Prime Number");
        }
        scanner.close();
    }
}

