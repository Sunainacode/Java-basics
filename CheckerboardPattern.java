import java.util.*;
import java.lang.*;
public class CheckerboardPattern{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++){
			if(i%2==0){
				for(int j=0;j<n/2+n%2;j++){System.out.print("* ");}
			}
			else{
				for(int j=0;j<n/2;j++){System.out.print(" *");}
			}
			System.out.println();
		}
	}
}