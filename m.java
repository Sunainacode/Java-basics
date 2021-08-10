import java.util.*;
import java.lang.*;
class CS extends Thread{
	boolean flag = false;
	String a;
	CS(){
		a="";
	}
	CS(String v){
		a=v;
	}
	public void client(String msg){
		synchronized(this){
	if(flag){		
		try{
               		System.out.println(" waiting to get notified");
                	this.wait();
            	}catch(InterruptedException e){
               		e.printStackTrace();
            	}}
		System.out.println("Message read by Client.");
		flag=true;
		notify();}
	}
	public void server(String msg) throws InterruptedException{
		synchronized(this){
		wait();
		notify();
		System.out.println("Message read by Server!");}
	}
	public void run(){
		try{
			server(this.a);
			client(this.a);
		}
		catch(Exception e){
			System.out.println(e);	
		}
			
			
	}
}

class m{
	public static void main(String[] args) throws InterruptedException{
		String inp=new String();
		Scanner sc=new Scanner(System.in);
		while(inp!="quit"){
		inp=sc.nextLine();
		CS cs=new CS(inp);
		cs.start();
		cs.join();}
		System.out.println("Conversation ended!");
	}
}