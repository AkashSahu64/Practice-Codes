import java.util.Scanner;
public class patern{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of row : ");
        int row = sc.nextInt();
       System.out.print("Enter the number of column : ");
        int col = sc.nextInt();
       for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            System.out.print("*");
        }
        System.out.print("\n");
       }
    }
}