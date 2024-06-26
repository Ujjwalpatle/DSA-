
import java.util.Scanner;


public class quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double root1 ,root2;
        System.out.println("Enter cofficent of x^2");
        a=sc.nextInt();
        System.out.println("Enter cofficent of x");
        b=sc.nextInt();
        System.out.println("Enter constant");
        c=sc.nextInt();

        root1=(-b+(Math.sqrt(b*b-(4*a*c))))/(2*a);
        root2=(-b-(Math.sqrt(b*b-(4*a*c))))/(2*a);

        System.out.println("root 1 is "+root1);
        System.out.println("root 2 is "+root2);
    }
}
