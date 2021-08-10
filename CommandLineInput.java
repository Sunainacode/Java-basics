public class CommandLineInput{
	public static void main(String[] args){
		int count=0,count2=0;
		for(int i=0;i<args.length;i++){
			try{
				int j=Integer.parseInt(args[i]);
				System.out.println("Valid number at "+i+" "+j);
				count++;
			}
			catch(NumberFormatException e){
				System.out.println("Invalid number at "+i+" "+args[i]);
				count2++;
			}
		}
		System.out.println("Invalid entries: "+count2);
		System.out.println("Valid entries: "+count);

	}

}