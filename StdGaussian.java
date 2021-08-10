import java.lang.*;
public class StdGaussian{
	public static void main(String[] args){
		double u,v,w;
		u=Math.random();
		v=Math.random();
		w=Math.sin(2*3.14*v)*Math.pow((-2*Math.log(u)),-1/2);
		System.out.println("Gaussian random number = " + w);
	}
}