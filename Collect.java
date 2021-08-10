import java.util.*;
class Collect{
	public static void main(String[] args){
		LinkedList<String> colors=new LinkedList<String>();
		LinkedList<String> colors2=new LinkedList<String>();
		Iterator<String> itr,itr2;
		colors.add("black");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		colors.add("violet");
		colors.add("silver");
		colors2.add("gold");
		colors2.add("white");
		colors2.add("brown");
		colors2.add("blue");
		colors2.add("gray");
		colors2.add("silver");
		colors.addAll(colors2);
		itr = colors.iterator();
		itr2 = colors2.iterator();
		while(itr2.hasNext()){
			colors2.remove();
		}
		System.out.println("list:");
    		while(itr.hasNext()){  
           		System.out.print(itr.next()+" ");  
    		}
		System.out.println();
		colors.replaceAll(String::toUpperCase);
		System.out.println("list:");
		itr=colors.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("Deleting elements 4 to 6... ");
		System.out.println("list:");
		colors.subList( 4, 7 ).clear();  
		itr=colors.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("Reversed list: ");
		ListIterator iter=colors.listIterator(colors.size());
		while( iter.hasPrevious() )
	             System.out.print( iter.previous() + " " );
		/*while(itr.hasPrevious()){
			System.out.print(itr.previous()+" ");
		}*/
	}
}