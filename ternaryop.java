public class ternaryop {
    public static void main(String args[]) {
        int i=1;
        int j=6;
        if(i==1){
            j=7;
        }
        else{
            j=9;
        }
        System.out.println(j);
        j = i==1?6:7;
        System.out.println(j);
        // Object obj1;
        // Object obj2;
        
    }
}