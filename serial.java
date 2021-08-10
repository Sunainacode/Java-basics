import java.lang.*;
import java.util.*;
public class serial{
	public static class counter{
		public static int count=1;
		int serial;
		counter(){
			serial=count;
			count++;
		}
		void report(){
			System.out.println("My serial number is "+serial);
		}
	}
	public static void main(String[] args){
		counter a=new counter();
		counter b=new counter();
		counter c=new counter();
		a.report();
		b.report();
		c.report();
		
	}


}