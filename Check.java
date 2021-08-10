
class Check{
  public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
  public static void main( String args[] ) {  
        Double[] doubleArray = { 10.2, 20.3, 30.22, 40.4, 50.2 };  
        Character[] charArray = { 'S', 'U', 'N', 'A', 'I','N','A' };  
  
        System.out.println( "Double Array" );  
        printArray( doubleArray  );   
  
       System.out.println( "Character Array" );  
        printArray( charArray );   
    }   
}
