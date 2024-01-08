import java.util.Scanner;
public class Choice_method {
    int real;
    int img;
    Choice_method(){
        System.out.println("With no parameter");
        real = 0;
        img = 0;
    }
    Choice_method(int r, int i){
        System.out.println("With 2 parameter");
        real = r;
        img = i;
    }
    Choice_method(int v){
        System.out.println("With one argument");
        real = v;
        img = v;
    }
    Choice_method(Choice_method obj){
        System.out.println("With a comlex object");
        real = obj.real;
        img = obj.img;
    }
    void add(Choice_method n){
        real = real+n.real;
        img = img+n.img;
    }
    Complex sum(Choice_method n) {
        Complex t = new Complex();
        t.real = real + n.real;
        t.img = img + n.img;
        return t;
    }
    Choice_method twice(){
        this.real = this.real*2;
        this.img = this.img*2;
        return this;
    }
    void display(){

        System.out.println(real+"+"+img+"i");
    }

    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        import java.util.Scanner;
public class Choice_method {
    int real;
    int img;
    Choice_method(){
        System.out.println("With no parameter");
        real = 0;
        img = 0;
    }
    Choice_method(int r, int i){
        System.out.println("With 2 parameter");
        real = r;
        img = i;
    }
    Choice_method(int v){
        System.out.println("With one argument");
        real = v;
        img = v;
    }
    Choice_method(Choice_method obj){
        System.out.println("With a comlex object");
        real = obj.real;
        img = obj.img;
    }
    void add(Choice_method n){
        real = real+n.real;
        img = img+n.img;
    }
    Complex sum(Choice_method n) {
        Complex t = new Complex();
        t.real = real + n.real;
        t.img = img + n.img;
        return t;
    }
    Choice_method twice(){
        this.real = this.real*2;
        this.img = this.img*2;
        return this;
    }
    void display(){

        System.out.println(real+"+"+img+"i");
    }

    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        System.out.println("Select your choice for a complex variable :\n Press 1. For two variable parameter" +
                "Press 2. For one variable parameter\n Press 3. With no variable parameter \n Press 4. For adding the complex variables" +
                "Press 5. For sum of two complex variable \n Press 6. For twice of a complex variable");
        System.out.println("Enter your choice : ");
        int ch = akash.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter the value of x : ");
                int x = akash.nextInt();
                System.out.print("Enter the value of y : ");
                int y = akash.nextInt();
                Choice_method c1 = new Choice_method(x,y);
                c1.display();
                break;
            case 2:
                System.out.print("Enter the value of z : ");
                int z = akash.nextInt();
                Choice_method c2 = new Choice_method(z);
                c2.display();
                break;
            case 3:
                Choice_method c3 = new Choice_method();
                c3.display();
                break;
            case 4:
                System.out.print("Enter the value of p : ");
                int p = akash.nextInt();
                System.out.print("Enter the value of q : ");
                int q = akash.nextInt();
                Choice_method a = new Choice_method(p,q);
                a.add(c2);
                System.out.println("Adding the two complex variable : ");
                a.display();
                break;
            case 5:
                Choice_method c2 = new Choice_method(z);
                Complex c4;
                System.out.println("Sum of two complex variable : ");
                c4 = c2.sum(c1);
                c4.display();
                break;
            case 6:
                Choice_method c5;
                System.out.println("Twice of a complex variable :");
                c5 = c1.twice();
                c5.display();
                break;
            default:
                System.out.println("Please Enter valid number !");

        }


    }
}