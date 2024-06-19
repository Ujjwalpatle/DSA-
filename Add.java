import java.util.Scanner;

public class Add {
    public static void main(String args[]) {
        Scanner S=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two no.");
        a=S.nextInt();
        b=S.nextInt();
        c=a+b;
        System.out.println("sum of two no. are="+ c);



        String name;
        System.out.println("may i know your name");
        name=S.next();
        System.out.println("Your name is "+ name);
    }
}