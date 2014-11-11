import java.util.TreeSet;



public class DupeCharsInOrder {



public static void main( String[] args ) {
    
    int dupes = DupeCharsInOrder.getAlphabetWithoutDupes( "8aurne82aarne".toCharArray() );
}
    /**
     * Assuming there will be no upper case letters
     */
    public static int getAlphabetWithoutDupes( char[] array ) {
        
        TreeSet<Character> characters = new TreeSet<Character>();
        int dupes = 0;
        
        for( Character c : array ) {
            if( c.isAlphabetic(c)) {
                int size = characters.size();
                characters.add( c );
                
                if( size == characters.size() ) {
                    dupes++;
                }
            }
        }
        
        for( Character c : characters ) {
            System.out.print( c );
        }
        
        System.out.println( "" );
        
        return dupes;
    }
}