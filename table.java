public class table{
	public static void main(String[] args){
		System.out.println("logN \t\t\t N \t\t NlogN \t\t N^2 \t\t N^3");
		int i=16;
		while(i<=2048){
			System.out.println(Math.log(i)+" \t "+i+" \t "+i*Math.log(i)+" \t "+i*i+" \t "+i*i*i);
			i=i*2;
		}
	}
}