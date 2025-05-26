import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input,output;
        System.out.print("Enter an integer: ");
        input = scanner.nextInt();

        output = count_digits(input);

        System.out.println("No of digits: " + output);

        scanner.close();
    }
    static int count_digits(int input){

        int output=0;

        while(input>0){
            input = input/10;
            output++;
        }

        return output;
    }
}