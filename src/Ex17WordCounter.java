import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;

/**
 * Created by eimearreilly on 03/02/2017.
 */
public class Ex17WordCounter {

    private ArrayList<String> words;

    public Ex17WordCounter(String url){
        words = new ArrayList<String>();

        Scanner webInput = null;
        try{
            URL u = new URL(url);
            webInput = new Scanner(u.openStream());
        }

        catch (Exception e){
            System.out.println("Couldn't open the URL '"+url+ "'. Sorry.");
            System.exit(1);
        }

        while(webInput.hasNext())
            words.add(webInput.next());
        webInput.close();
    }

    // Change get count so it only counts exact matches including capitalisation
    // Change it so that words will match irregardless of their case


    public int getCount(String word) {
        int count = 0;
        for (String s : words) {
            if (s.equals(word)) {
                count++;
            }
        }
            return count;

    }

}
