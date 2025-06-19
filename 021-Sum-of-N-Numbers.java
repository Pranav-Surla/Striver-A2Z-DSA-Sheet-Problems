import java.util.Scanner;
class  Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Till how many numbers you want sum:");
        int x = scanner.nextInt();
        System.out.print("From Which number you want the sum:");
        int y = scanner.nextInt();
        int sum = 0;

        for(int i = y; i<=x;i++ ){
         sum = sum +  i; 
        }
        System.out.println(sum);
        scanner.close();
    }
}