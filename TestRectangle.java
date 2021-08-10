import java.util.*;

class Rectangle{
	double length,width;		//data members
	Rectangle()	
	//default constructor must not have return types like void or int
	{
		length=0;
		width=0;
	}
	Rectangle(double length, double width){	//parameterized constructor(overloaded)
		this.length=length;		//this pointer
		this.width=width;
	}
	void area(){		//member function
		double res=length*width;
		System.out.println("Area = "+res);
	}
}
public class TestRectangle{
	public static void main(String args[]){
		Rectangle r1=new Rectangle(100.0,20.0);
		r1.area();
		Scanner sc=new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		Rectangle r2=new Rectangle(a,b);
		r2.area();
	}
}