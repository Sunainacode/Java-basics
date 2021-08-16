import java.util.Scanner;
public class palindrome {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int a=0;
        while(n>0){
            a=a*10+(n%10);
            n=n/10;
        }
        if(x==a){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
//perfect number, prime number