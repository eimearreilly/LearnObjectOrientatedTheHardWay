import java.util.Scanner;

/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex5StringFunOODriver {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);

        //Input it
        System.out.print("Enter a message: ");
        String msg = kb.nextLine();

        Ex5StringFunObject sfo = new Ex5StringFunObject();
        sfo.setMessage(msg);
        sfo.halfMessage();

        //display it
        System.out.println(sfo.getMessage());
    }
}
