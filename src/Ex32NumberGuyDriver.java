import java.util.ArrayList;

/**
 * Created by eimearreilly on 07/02/2017.
 */
public class Ex32NumberGuyDriver {
    public static void main(String[] args){
        Ex32NumberGuy n = new Ex32NumberGuy(5);

        System.out.println(n);
        n.doubleYourself();
        System.out.println(n);

        int q = 4;
        System.out.println(q);
        n.changeThis(q);

        System.out.println(q);

        double y = 4;
        n.doubleMe(y);

        System.out.println(y);
    }
}
