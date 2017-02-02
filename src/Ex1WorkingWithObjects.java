import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by eimearreilly on 01/02/2017.
 */

public class Ex1WorkingWithObjects {
    public static void main(String [] args) throws Exception {
        File f = new File("datafiles/phonetic-alphabet.txt");

        if ( f.exists() == false){
            System.out.println(f.getName() + " not found in this fold. :(");
            System.exit(1);
        }

        ArrayList<String> words = new ArrayList<String>();
        Scanner alpha = new Scanner(f);

        System.out.println("Reading words from \""+ f.getPath() + "\"...");
        while (alpha.hasNext()){
            String w = alpha.next();
            words.add(w);
        }
        alpha.close();
        System.out.print("done.\n\t");

        Random rng = new Random();
        rng.setSeed(12345);

        for( int n=0; n<3; n++){
            int i = rng.nextInt(words.size());
            String s = words.get(i);
            System.out.println(s.toLowerCase() + " ");
        }
        System.out.println();
    }
}