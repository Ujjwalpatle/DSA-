
import java.util.Arrays;



public class string {
    public static void main(String[] args) {
        String str1="java";
        String str5="java";
        //create new object when we use new keyword
        String str2=new String("java");

        char c[]={'a','b','c'};
        String str3=new String(Arrays.toString(c) +" ");

        byte b[]={65,66,67,68,69,70};
        String str4=new String(b,1,2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1==str5);
        System.out.println(str1==str2);
    }
}
