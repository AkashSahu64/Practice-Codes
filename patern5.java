import java.util.Scanner;
public class patern5{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of count : ");
         int count = sc.nextInt();
       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(count);
            System.out.print(" ");
            count++;
        }
        System.out.print("\n");
       }
    }
}