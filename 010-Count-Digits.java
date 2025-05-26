// Problem Statement: Given an integer N, return the number of digits in N.

// Examples
//                 Example 1:
//                 Input:N = 12345
               
//                 Output:5
                
//                 Explanation:  The number 12345 has 5 digits.
                                        
//                 Example 2:
//                 Input:N = 7789                
                
//                 Output: 4
                
//                 Explanation: The number 7789 has 4 digits. 

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