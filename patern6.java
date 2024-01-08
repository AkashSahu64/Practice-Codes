import java.util.Scanner;
public class patern6{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        
       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        int space = 2*n-2*i;
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
       }

       for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        int space = 2*n-2*i;
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
       }
    }
}