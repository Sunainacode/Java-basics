import java.util.*;
public class exc{
public static void main(String[] args){
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in the array ");
n=sc.nextInt();
int[] arr=new int[n];
System.out.print("Enter the elements in the array ");
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
System.out.print("Enter the index of the element you want to access ");
int ind=sc.nextInt();
try{
	int f=arr[ind];
	System.out.println(f);
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e.getClass());
}
}

}