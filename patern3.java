import java.util.Scanner;
public class patern3{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
    //    System.out.print("Enter the number of column : ");
    //     int col = sc.nextInt();
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(j<=n-i){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
        System.out.print("\n");
       }
    }
}