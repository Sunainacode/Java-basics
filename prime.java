import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                f=1;
                break;
            }
            else{
                continue;
            }
        }
        if(f==1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }
}
