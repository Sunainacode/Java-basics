import java.lang.*;
public class compoundInterest{
	public static void main(String[] args){
		double p=Integer.parseInt(args[0]);
		double r=Integer.parseInt(args[1]);
		double t=Integer.parseInt(args[2]);
		System.out.println(p*Math.exp(r*t));
	}
}