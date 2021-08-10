import java.lang.*;
import java.util.*;
public class email{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		System.out.println(d.substring(0,d.indexOf("@")));
		System.out.println(d.substring(d.indexOf("@")+1));
	}
}