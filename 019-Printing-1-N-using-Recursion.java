import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter till how many numbers you want to print: ");
        int n = scanner.nextInt();
        repeat(1, n);  
        scanner.close();
    }

    static void repeat(int i, int n) {
        if (i > n) return;       
        System.out.println(i);   
        repeat(i + 1, n);        
    }
}
