class WrapCl{
	public static void main(String[] args){
		Double douWrap=new Double("1E6");
		Integer intWrap=new Integer(1_000_000);
		Boolean boolWrap=new Boolean(true);
		Character charWrap=new Character('A');
		System.out.print(douWrap+"\n"+intWrap+"\n"+boolWrap+"\n"+charWrap);
	}
}