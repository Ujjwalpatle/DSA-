





public class string {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // String str1="java";
        // String str5="java";
        // //create new object when we use new keyword
        // String str2=new String("java");

        // char c[]={'a','b','c'};
        // String str3=new String(Arrays.toString(c) +" ");

        // byte b[]={65,66,67,68,69,70};
        // String str4=new String(b,1,2);

        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);
        // System.out.println(str4);
        // System.out.println(str1==str5);
        // System.out.println(str1==str2);




        // String str="programmer@gmail.com";
        // int index=str.indexOf("@");
        // System.out.println(str.substring(0, index));
        // System.out.println(str.substring(index+1));
        // String a=str.substring(index);
        // System.out.println(a.matches(".*gmail.*"));


        // int b=1010101011;
        // String str=String.valueOf(b);
        // System.out.println("Number is binary: "+str.matches("[01]+"));

        // String str1="11AF10";
        // System.out.println("Number is hexadecimal: "+str1.matches("[0-9A-F]+"));

        // String str2="13/09/2004";
        // System.out.println("Date is : "+str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


        String str="A@B$C867%D@E#";
        String str1=str.replaceAll("[^A-Z0-9]","");
        System.out.println(str1);

        String str2="U jj w a l Pat le";
        String str3=str2.replaceAll("\\s","");
        System.out.println(str3);

        String str4[]=str2.split("\\s+");
        System.out.println(str4.length);


    }

    private static char[] split(int length) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'split'");
    }
}
