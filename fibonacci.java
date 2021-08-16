import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]) {
        int i=0;
        int j=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++){
            System.out.println(i+j);
            int temp;
            temp=j;
            j=i+j;
            i=temp;
        }
    }
}
