import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter till how many times you want to print name: ");
        int n = scanner.nextInt();
        repeat(n);
        scanner.close();
    }

    static void repeat(int n) {
        if (n == 0) return; 
        System.out.println("Pranav");
        repeat(n - 1); 
    }
}
