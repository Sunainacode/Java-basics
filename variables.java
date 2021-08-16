class variables{
    public static void main(String a[]) {
        // by default all real numbers are double in java
        // double takes 8 bytes
        // it appends a lot of zeros after the value hence wasting a lot of memory
        // to avoid this problem, float datatype can be used with a keyword f after the value
        // float num=g.4f;
        double num1=6.4;
        double num2=5.6;
        System.out.println(num1+num2);

        // char
        char b='c';
        System.out.println(b);
        // type casting
        System.out.println((int)b);  //print the ascii value of 'c'
        System.out.println((char)124);  //print the character value of '124'
    }
}