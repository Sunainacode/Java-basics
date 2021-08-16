import java.util.Scanner;
public class armstrong{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int a=0;
        while(n%10!=0){
            int b=n%10;
            b=b*b*b;
            a+=b;
            n=n/10;
        }
        if(a==x){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}