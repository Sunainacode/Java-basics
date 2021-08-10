import java.util.*;
import java.lang.*;
public class Xor{
	public static int[] xor(int a[], int b[],int x,int y){
		int r[];
		r=new int[x+y];
		for(int i=0;i<x;i++){
			r[i]=a[i];
		}
		for(int i=0;i<y;i++){
			r[x+i]=b[i];
		}
		for(int i=0;i<x+y;i++){
			for(int j=0;j<x+y;j++){
				if(r[i]==r[j] && i<x && j>=x){
					r[i]=0;
					r[j]=0;
				}
			}
		}
		for(int i=0;i<x+y;i++){
			for(int j=0;j<x+y;j++){
				if(r[i]<r[j] && i>j){
					int tem=r[i];
					r[i]=r[j];
					r[j]=tem;
				}	
			}
		}
		
		return r;
	}
	public static void main(String args[]){
		System.out.print("Enter the length of first int array: ");
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		System.out.println("Enter the length of second int array: ");
		int l2=sc.nextInt();
		int a[],b[];
		a=new int[l1];
		b=new int[l2];
		for(int i=0;i<l1;i++){
			System.out.print("Enter the "+i+"th element of first array: ");
			int d=sc.nextInt();
			a[i]=d;
			
		}
		for(int i=0;i<l2;i++){
			System.out.print("Enter the "+i+"th element of second array: ");
			int e=sc.nextInt();
			b[i]=e;
			
		}
		int s[];
		s=new int[l1+l2];
		s=xor(a,b,l1,l2);
		System.out.println("The xor of the array is: ");
		for(int i=0;i<l1+l2;i++){
			if(s[i]!=0){
			System.out.print(s[i]+" ");}
		}
		

	}

}