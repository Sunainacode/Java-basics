import java.util.*;
class CustomException extends Exception {
   String message;
   CustomException() {
      message = "Sum must be less than 100";
   }
   public String toString() {
      return ("Custom Exception Occurred : " + message);
   }
}
public class custexc{
public static int sum(int a, int b) throws CustomException{
	int su=a+b;
	if(su>=100){
		throw new CustomException();
	}
	
	else{
		return su;
	}
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	try{
		int z=sum(a,b);
		System.out.println("Sum="+z);
	}	
	catch(CustomException e){
		System.out.println(e);
	}
	finally{
		System.out.println("Code has been executed!");
	}
	
}
}