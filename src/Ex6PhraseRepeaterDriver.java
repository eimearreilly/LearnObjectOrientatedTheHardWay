import java.util.Scanner;

/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex6PhraseRepeaterDriver {
    public static void main(String [] args){
        Scanner kb = new Scanner( System.in);

        System.out.println("Enter a message: ");
        String msg = kb.nextLine();
        System.out.println("Number of times: ");
        int n = kb.nextInt();

        Ex6PhraseRepeater pr = new Ex6PhraseRepeater();
        pr.setValues(msg, n);
        System.out.println(pr.getrepeatedPhrase());
    }
}
