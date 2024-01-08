import java.util.Scanner;
public class patern1{
    public static void main(String[] args){
       Scanner akash = new Scanner(System.in);
       System.out.print("Enter the value of row : ");
        int row = akash.nextInt();
       System.out.print("Enter the number of column : ");
        int col = akash.nextInt();
       for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            if(i==1 || i==row || j==1 || j==col){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
       }
    }
}