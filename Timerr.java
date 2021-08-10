import java.lang.*;
import java.util.*;

public class Timerr{
	public static class time{
		int hours,minutes,seconds;
		time(){
			hours=0;
			minutes=0;
			seconds=0;
		}
		time(int h,int m,int s){
			hours=h;
			minutes=m;
			seconds=s;
		}
		public void twelhour(){
			if(hours>11){
				System.out.println(hours-12+":"+minutes+":"+seconds);
			}
			else{
				System.out.println(hours+":"+minutes+":"+seconds);
			}
		}
		public void addtime(time a, time b){
			hours=a.hours+b.hours;
			minutes=a.minutes+b.minutes;
			seconds=a.seconds+b.seconds;
			if(seconds>=60){
				seconds=seconds-60;
				minutes=minutes+1;
			}
			if(minutes>=60){
				minutes-=60;
				hours+=1;
			}
			if(hours>=24){
				hours=hours-24;
			}
		}
	}
	public static void main(String[] args){
		final time a=new time(13,45,14);
		final time b=new time(9,30,22);
		time c=new time();
		c.addtime(a,b);
		c.twelhour();		
	}
}