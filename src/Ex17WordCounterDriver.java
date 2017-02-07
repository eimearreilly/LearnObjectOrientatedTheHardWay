/**
 * Created by eimearreilly on 03/02/2017.
 */
public class Ex17WordCounterDriver {
    public static void main(String [] args){
        String book = "http://www.gutenberg.org/cache/epub/159/pg159.txt";

        Ex17WordCounter wc = new Ex17WordCounter(book);

        System.out.println(wc.getCount("the"));
        System.out.println(wc.getCount("I"));
        System.out.println(wc.getCount("a"));
    }
}
