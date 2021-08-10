import java.lang.*;
import java.util.*;

public class Result{
	public static class Message{
		private String s;
		Message(String f){
			s=f;
		}
		public void print(){
			System.out.println(s);
		}
		public void print(String d){
			System.out.println(s+" "+d);
		}
	}	
	public static void main(String[] args){
		Message a=new Message("Hello");
		a.print();
		a.print("I am Sunaina Agarwal");
	}
}