// import java.util.Scanner;
// // import java.util.Math;

// class Main {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int i ,j,n ;
//         n = 5;
//         System.out.print("Enter the no of rows and coloumns: ");
//         n = scanner.nextInt();
//         pattern22(n);

//         scanner.close();        
//     }

    
//     static void pattern1(int n){
//         int i,j;
//          for(i=0;i<= n;i++){
//             for(j=0;j<= n ;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern2(int n){
//         int i,j;
//          for(i=0;i<= n ;i++){
//             for(j=0;j< i ;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
//     static void pattern3(int n){
//         int i,j;
//          for(i=0;i<= n ;i++){
//             for(j=0;j< i ;j++){
//                 System.out.print(j  + 1);
//             }
//             System.out.println();
//         }
//     }
    
//     static void pattern4(int n){
//         int i,j;
//          for(i=0;i<= n ;i++){
//             for(j=0;j< i ;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }    
//     }

//     static void pattern5(int n){
//         int i,j;
//          for(i=0;i<= n ;i++){
//             for(j=0;j< n-i ;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }    
//     }

//     static void pattern6(int n){
//         int i,j;
//          for(i=0;i<= n ;i++){
//             for(j=0;j< n-i ;j++){
//                 System.out.print(j+1);

//             }
//             System.out.println();
//         }    
//     }

//     static void pattern7(int n){
//         int i,j;
//         for(i=0;i< n ;i++){
//             for(j=0;j< n-i ;j++){
//                 System.out.print(" ");
//             }

//             for(j= 0;j < 2*i + 1;j++){
//                 System.out.print("*");
//             }

//             for(j=0;j< n-i;j++){
//                 System.out.print(" ");
//             }
            
//             System.out.println();
//         }
//     }

//     static void pattern8(int n){
//         int i,j;
//          for(i=0;i< n ;i++){
//             for(j=0;j<i ;j++){
//                 System.out.print(" ");
//             }

//             for(j= 0;j <2 * n - (2*i + 1);j++){
//                 System.out.print("*");
//             }

//             for(j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
     
//     static void pattern9(int n){
//         int i,j;
//         for(i=0;i< n ;i++){
//             for(j=0;j< n-i-1 ;j++){
//                 System.out.print(" ");
//             }

//             for(j= 0;j < 2*i + 1;j++){
//                 System.out.print("*");
//             }

//             for(j=0;j< n-i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }   

//         for(i=0;i< n ;i++){
//             for(j=0;j<i ;j++){
//                 System.out.print(" ");
//             }

//             for(j= 0;j <2 * n - (2*i + 1);j++){
//                 System.out.print("*");
//             }

//             for(j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }     
//     }

//     static void pattern10(int n){
//         int i,j;
//         for(i=1;i<= 2*n-1 ;i++){
//             int stars = i;
//             if (i > n) {
//                 stars = 2*n - i;                
//             }
//             for(j=1;j<= stars;j++){
//                 System.out.print("*");
//             }System.out.println();
//         }    
//     }

//     static void pattern11(int n){
//         int i,j;
//         int start = 1;
//          for(i=0;i< n ;i++){
//             if (i % 2 == 0) {start = 1;
//             }
//             else{
//                 start = 0;
//             }

//             for(j=0;j<=i ;j++){
//                 System.out.print(start);
//                 start = 1 - start;

//             }System.out.println();
//         }
    
//     }
//     static void pattern12(int n){
//         int i,j;
       
//          for(i=1;i<= n ;i++){
//             int space = 2* (n-i);
//             for(j=1;j<=i ;j++){
//                 System.out.print(j);}
//             for(j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(j=i;j>=1 ;j--){
//                 System.out.print(j);

//             }System.out.println();
//             space -= 2;
        
//     }
    
//   }
//     static void pattern13(int n){
//         int i,j;
//         int num = 1;
//          for(i=0;i<= n ;i++){
//             for(j=0;j<i ;j++){
//                 System.out.print(num + " ");
//                 num++;

//             }System.out.println();}
//     }
//     static void pattern14(int n){
//         int i;

//          for(i=0;i<=n ;i++){
//             for(char alphabet = 'A';alphabet < 'A' + i ;alphabet++){
//                 System.out.print(alphabet + " ");

//             }System.out.println();}
//     }
//     static void pattern15(int n){
//         int i;

//          for(i=0;i<n ;i++){
//             for(char alphabet = 'A';alphabet <= 'A' +(n - i -1) ;alphabet++){
//                 System.out.print(alphabet + " ");

//             }System.out.println();}
//     }
//     static void pattern16(int n){


//          for(int i=0;i<n ;i++){
//             char alphabet =(char)( 'A' + i) ;
//             for(int j=0;j<=i;j++){
//                 System.out.print(alphabet + " ");

//             }System.out.println();}
//     }
//     static void pattern17(int n){
//         int i,j;
//          for(i=0;i< n ;i++){
//             for(j=0;j< n-i ;j++){
//                 System.out.print(" ");
//             }
//             char alphabet = 'A';
//             int breakpoint = (2*i + 1)/2;
//             for(j= 1;j <=2*i + 1;j++){
//                 System.out.print(alphabet);
//                 if (j <= breakpoint) { alphabet++;}     
//                 else{alphabet--;}
//             }

//                     for(j=0;j< n-i-1;j++){
//                 System.out.print(" ");
//             }
//                     System.out.println();
//                 }   

//             }
//     static void pattern18(int n){
//         int i;
//         char alphabet;
//          for(i=0;i< n ;i++){
//             for(alphabet = (char)('A' + n - i);alphabet <= 'A'+ n ;alphabet++){
//                 System.out.print(alphabet + " ");

//             }System.out.println();
//         }
    
//     }
//     static void pattern19(int n) {
//     int inside = 0;
//     for (int i = 0; i < n; i++) {
        
//         for (int j = 1; j <= n - i; j++) {
//             System.out.print("*");
//         }

//         for (int j = 0; j < inside; j++) {
//             System.out.print(" ");
//         }

//         for (int j = 1; j <= n - i; j++) {
//             System.out.print("*");
//         }

//         inside += 2; 
//         System.out.println(); 
//     }
//          inside = 2 * n - 2; 
//     for (int i = 1; i <= n; i++) {
        
//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }

//         for (int j = 1; j <= inside; j++) {
//             System.out.print(" ");
//         }

//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }

//         inside -= 2; 
//         System.out.println(); 
//     }
// }
//     static void pattern20(int n) {

//     int inside = 2 * (n - 1);
//     for (int i = 1; i <= n; i++) {

//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }

//         for (int j = 1; j <= inside; j++) {
//             System.out.print(" ");
//         }

//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }

//         inside -= 2;
//         System.out.println();
//     }

//     inside = 2;
//     for (int i = n - 1; i >= 1; i--) {

//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }

//         for (int j = 1; j <= inside; j++) {
//             System.out.print(" ");
//         }

//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }

//         inside += 2;
//         System.out.println();
//     }
// }
//     static void pattern21(int n) {
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n; j++) {
//             if (i == 0 || i == n-1 || j == 0 || j == n-1) {
//                 System.out.print("* ");
//             } else {
//                 System.out.print("  "); 
//             }
//         }
//         System.out.println();
//     }
// }
// static void pattern22(int n){
//     int inside;
//     int i,j;
//     for( i=0;i< 2*n - 1;i++ ){
//         for ( j = 0; j < 2*n - 1; j++) {
//             int top = i;
//             int left = j;
//             int right = (2*n -2) - j;
//             int bottom = (2*n -2) - i;
            
//             int min_value = Math.min(Math.min(top, bottom), Math.min(right, left));

//             System.out.print(n-min_value);

//         }
//         System.out.println();
//     }

    
// }

// }


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();

        System.out.println("\nPattern 1:");
        pattern1(n);
        System.out.println("\nPattern 2:");
        pattern2(n);
        System.out.println("\nPattern 3:");
        pattern3(n);
        System.out.println("\nPattern 4:");
        pattern4(n);
        System.out.println("\nPattern 5:");
        pattern5(n);
        System.out.println("\nPattern 6:");
        pattern6(n);
        System.out.println("\nPattern 7:");
        pattern7(n);
        System.out.println("\nPattern 8:");
        pattern8(n);
        System.out.println("\nPattern 9:");
        pattern9(n);
        System.out.println("\nPattern 10:");
        pattern10(n);
        System.out.println("\nPattern 11:");
        pattern11(n);
        System.out.println("\nPattern 12:");
        pattern12(n);
        System.out.println("\nPattern 13:");
        pattern13(n);
        System.out.println("\nPattern 14:");
        pattern14(n);
        System.out.println("\nPattern 15:");
        pattern15(n);
        System.out.println("\nPattern 16:");
        pattern16(n);
        System.out.println("\nPattern 17:");
        pattern17(n);
        System.out.println("\nPattern 18:");
        pattern18(n);
        System.out.println("\nPattern 19:");
        pattern19(n);
        System.out.println("\nPattern 20:");
        pattern20(n);
        System.out.println("\nPattern 21:");
        pattern21(n);
        System.out.println("\nPattern 22:");
        pattern22(n);

        scanner.close();
    }

    // Pattern 1: Square of '*'
    static void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 2: Right-angle triangle with '*'
    static void pattern2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 3: Number triangle (increasing row values)
    static void pattern3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // Pattern 4: Number triangle (same number in a row)
    static void pattern4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Pattern 5: Inverted right-angle triangle with '*'
    static void pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 6: Inverted triangle with numbers
    static void pattern6(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // Pattern 7: Pyramid of '*'
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            System.out.println();
        }
    }

    // Pattern 8: Inverted pyramid of '*'
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.println();
        }
    }

    // Pattern 9: Diamond of '*'
    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    // Pattern 10: Diamond pattern using single loop logic
    static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? 2 * n - i : i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 11: Binary triangle
    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    // Pattern 12: Symmetric number pyramid
    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            int space = 2 * (n - i);
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = 1; j <= space; j++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    // Pattern 13: Number triangle with incrementing numbers
    static void pattern13(int n) {
        int num = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Pattern 14: Triangle of characters
    static void pattern14(int n) {
        for (int i = 0; i <= n; i++) {
            for (char alphabet = 'A'; alphabet < 'A' + i; alphabet++) {
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }

    // Pattern 15: Inverted triangle of characters
    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char alphabet = 'A'; alphabet <= 'A' + (n - i - 1); alphabet++) {
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }

    // Pattern 16: Character triangle with repeating letters
    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char alphabet = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }

    // Pattern 17: Pyramid of increasing then decreasing characters
    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            char alphabet = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(alphabet);
                alphabet += (j <= breakpoint) ? 1 : -1;
            }
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            System.out.println();
        }
    }

    // Pattern 18: Right-aligned triangle of characters
    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char alphabet = (char) ('A' + n - i); alphabet <= 'A' + n; alphabet++) {
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }

    // Pattern 19: Hourglass of '*'
    static void pattern19(int n) {
        int inside = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("*");
            for (int j = 0; j < inside; j++) System.out.print(" ");
            for (int j = 1; j <= n - i; j++) System.out.print("*");
            inside += 2;
            System.out.println();
        }
        inside = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= inside; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            inside -= 2;
            System.out.println();
        }
    }

    // Pattern 20: Butterfly pattern of '*'
    static void pattern20(int n) {
        int inside = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= inside; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            inside -= 2;
            System.out.println();
        }
        inside = 2;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= inside; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            inside += 2;
            System.out.println();
        }
    }

    // Pattern 21: Square border of '*'
    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Pattern 22: Square spiral pattern of decreasing numbers
    static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i, left = j, right = (2 * n - 2) - j, bottom = (2 * n - 2) - i;
                int min_value = Math.min(Math.min(top, bottom), Math.min(right, left));
                System.out.print(n - min_value);
            }
            System.out.println();
        }
    }
}

    
   



    

