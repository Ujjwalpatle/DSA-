

public class bitwise {
    public static void main(String[] args) {
        int x=0b1010;
        int y=0b0110;
        int z,a,b,c,d,e;
        z=x|y;
        a=x^y;
        b=x&y;
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);


        c=x>>1;
        d=x<<1;
        e=x>>>1;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
