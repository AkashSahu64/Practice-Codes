// import java.util.*;
// public class practice {
//     public static void main(String[] args) {
//         // int num1 = 10; // binary: 1010
//         // int num2 = 5;  // binary: 0101
//         // int num3 = 10; // binary: 1010
        
//         // if ((num1 & num2) == num1) {
//         //     System.out.println("num1 is the bitwise AND of num1 and num2");
//         // } else if ((num1 & num3) == num1) {
//         //     System.out.println("num1 is the bitwise AND of num1 and num3");
//         // } else {
//         //     System.out.println("num1 is not the bitwise AND of any two numbers");
//         // }

//         Scanner akash = new Scanner(System.in);
//         System.out.print("Enter the vslue of a : ");
//         int a = akash.nextInt();
//         System.out.print("Enter the value of b : ");
//         int b = akash.nextInt();
//         System.out.print("Enter the value of c : ");
//         int c = akash.nextInt();
//         if((a & b & c) == a){
//             System.out.println(a+" is smallest number among a,b,c");
//         }
//         else if((a & b & c) == b){
//             System.out.println(b+" is smallest number among a,b,c");
//         }
//         else{
//             System.out.println(c+" is smallest number among a,b,c");
//         }

//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Enter the first number: ");
//         int num1 = input.nextInt();
        
//         System.out.print("Enter the second number: ");
//         int num2 = input.nextInt();
        
//         System.out.print("Enter the third number: ");
//         int num3 = input.nextInt();
        
//         if ((num1 & num2) == num1) {
//             System.out.println(num1 + " is the bitwise AND of " + num1 + " and " + num2);
//         } else if ((num1 & num3) == num1) {
//             System.out.println(num1 + " is the bitwise AND of " + num1 + " and " + num3);
//         } else {
//             System.out.println(num1 + " is not the bitwise AND of any two numbers");
//         }
        
//         input.close();
//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Enter the first number: ");
//         int num1 = input.nextInt();
        
//         System.out.print("Enter the second number: ");
//         int num2 = input.nextInt();
        
//         System.out.print("Enter the third number: ");
//         int num3 = input.nextInt();
        
//         // Find the smallest number
//         int smallest = num1;
//         if (num2 < smallest) {
//             smallest = num2;
//         }
//         if (num3 < smallest) {
//             smallest = num3;
//         }
//         System.out.println("The smallest number is: " + smallest);
        
//         // Find the greatest number
//         int greatest = num1;
//         if (num2 > greatest) {
//             greatest = num2;
//         }
//         if (num3 > greatest) {
//             greatest = num3;
//         }
//         System.out.println("The greatest number is: " + greatest);
        
//         // Compare num1 to num2 and num3 using bitwise AND operator
//         if ((num1 & num2) == num1) {
//             System.out.println(num1 + " is the bitwise AND of " + num1 + " and " + num2);
//         } else if ((num1 & num3) == num1) {
//             System.out.println(num1 + " is the bitwise AND of " + num1 + " and " + num3);
//         } else {
//             System.out.println(num1 + " is not the bitwise AND of any two numbers");
//         }
        
//         input.close();
//     }
// }

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String var = "Saurabh";


        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */

    }
}
