import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the Second Number: ");
        int y = scanner.nextInt();

        for(int i = Math.min(x, y); i >= 1; i--){
            if (x%i == 0 && y%i ==0) {
                System.out.println(i);
                break;  
            }
        }
        scanner.close();
    } 
}  
    

