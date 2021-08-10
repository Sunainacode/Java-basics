class Shapes{
	static float side,len,bre,res;
	static int rad;
	static void area(float s){
		side=s;
		res=side*side;
		System.out.println(res);
	}
	static void area(int r){
		rad=r;
		res=3.14f*rad*rad;
		System.out.println(res);
	}
	static void area(float l,float b){
		len=l;
		bre=b;
		res=len*bre;
		System.out.println(res);
	}
}
class MethodOver{
	public static void Main(String args[]){
		Shapes.area(20.0f);
		Shapes.area(30);
		Shapes.area(3.6f,6.8f);
	}
}