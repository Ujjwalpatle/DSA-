
import java.util.Scanner;


public class quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //traingle
        // int a,b,c;
        // double root1 ,root2;
        // System.out.println("Enter cofficent of x^2");
        // a=sc.nextInt();
        // System.out.println("Enter cofficent of x");
        // b=sc.nextInt();
        // System.out.println("Enter constant");
        // c=sc.nextInt();

        // root1=(-b+(Math.sqrt(b*b-(4*a*c))))/(2*a);
        // root2=(-b-(Math.sqrt(b*b-(4*a*c))))/(2*a);

        // System.out.println("root 1 is "+root1);
        // System.out.println("root 2 is "+root2);


        //cubiod
        int l,b,h;
        double area,pare,volume;
        System.out.println("enter L,B,H of cuboid");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        area=2*((l*b)+(b*h)+(l*h));
        volume=l*b*h;
        pare=4*(l+b+h);
        System.out.println("area is "+area);
        System.out.println("volume is "+volume);
        System.out.println("paremeter is "+pare);
    }
}
