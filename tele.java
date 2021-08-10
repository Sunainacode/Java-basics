import java.lang.*;
import java.util.*;
public class tele{
	public static void main(String[] args){
		System.out.println("Enter a telephone number in the format xx-xxx-xxxx : ");
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		System.out.println(d.substring(0,1)+"-"+d.substring(1,2)+d.substring(3));
	}
}