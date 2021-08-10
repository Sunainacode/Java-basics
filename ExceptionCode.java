class ExceptionCode{
	public static void main(String[] args){
		try{	
			int i=args.length;
			String myString[]=new String[i];
			if(myString[0].equals("Java"))
				System.out.println("First word is Java !");
			System.out.println(" Number of arguments = "+i);
			int x=18/i;
			int y[]={555,999};
			y[i]=x;
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception");	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Number of Command line arguments exceeds the length of array y");
		}
		catch(ArithmeticException e){
			System.out.println("Enter at least one element in the command line arguments.");
		}
		catch(Exception e){
			System.out.println("Some other exception occured");
		}
	}
}