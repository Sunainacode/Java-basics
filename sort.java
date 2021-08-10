import java.util.*;
public class sort{
	public static void main(String[] args){
		int a,b,c,t;
		System.out.print("Enter three numbers to sort them: ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a > b) { t = a; a = b; b = t; }
		if (a > c) { t = a; a = c; c = t; }
		if (b > c) { t = b; b = c; c = t; }
		System.out.println("Numbers after sorting are: \n\t\t a = "+a+" \n\t\t b = "+b+" \n\t\t c = "+c);
	}
}