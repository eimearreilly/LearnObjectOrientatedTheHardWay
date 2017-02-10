import java.io.FileInputStream;

public class Ex22IBeforeEDriver {
    public static void main( String[] args ) throws Exception {
        //Modify the driver code so that it can read from a URL instead of a local file.
        //URL url = new URL("http://www.example.org/example.txt");
        //Scanner s = new Scanner(url.openStream());

        FileInputStream file = new FileInputStream("datafiles/en-sample.txt");
        Ex22IBeforeEChecker check = new Ex22IBeforeEChecker( file );
        System.out.println( check.getWordCount() + " ie/ei words found." );
        System.out.print( "\t" + check.getMatches() + " match the rule, " );
        System.out.print( check.getExceptions() + " do not: " );
        System.out.println(100.0*check.getMatches()/check.getWordCount() + "%");

        // Modify the code so that it prints out the list of ie/ei words
        System.out.println(check.getWordList());


    } }