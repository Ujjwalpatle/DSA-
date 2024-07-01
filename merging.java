class merging{
    public static void main(String[] args) {
        // int a=10;
        // int b=15;

        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println(a);
        // System.out.println(b);


        //merging
        byte c;
        c=(byte)(9<<4);
        c=(byte)(c|12);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));

    }
}