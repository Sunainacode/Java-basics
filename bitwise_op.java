class bitwise_op {
    public static void main(String a[]) {
        int c=21; //10101
        int b=15; //01111
        //& 00101
        //| 11111
        int d=b&c;
        System.out.println(d);
        int e=b | c;
        System.out.println(e);
    }    
}
