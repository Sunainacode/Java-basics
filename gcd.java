import java.util.Scanner;
public class gcd{
	public static int gc(int a, int b){
		int x=a>b?a:b;
		int y=a<b?a:b;
		if(x%y==0){
			return y;
		}
		else{
			return gc(x%y,y);
		}
	}
	public static void main(String[] args){
		System.out.print("Enter two numbers to find their GCD : ");
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("GCD of "+a+" and "+b+" is "+gc(a,b));
	}
}