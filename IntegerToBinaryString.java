import java.util.*;
import java.lang.*;
public class IntegerToBinaryString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to be converted to binary string: ");
		int n=sc.nextInt();
		String s=new String("");
		while(n!=0){
			int a=n%2;
			n=n/2;
			s=a+s;
		}
		System.out.println(s);
	}

}