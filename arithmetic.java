
import java.util.Scanner;

public class arithmetic {
    public static void main(String args[]) {
        float base,height,area;
        System.err.println("Enter base and height");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=(base*height)/2;
        System.out.println("Area of Triangal"+area +"cm^3");


        float a,b,c,s;
        double z;
        System.err.println("Enter all 3 sides");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        z= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangal"+area +"cm^3");


    }
}
