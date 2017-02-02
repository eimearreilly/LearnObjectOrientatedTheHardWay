import java.util.Scanner;

/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex7SquareRootDriver {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double n;

        Ex7SquareRootFinder sqrt = new Ex7SquareRootFinder();
        do {
            System.out.println("Enter a number (or 0 to quit): ");
            n = kb.nextDouble();

            if(n>0){
                sqrt.setNumber(n);
                System.out.println(sqrt.getRoot() );
            }
        } while (n > 0);
    }
}