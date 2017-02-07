import static java.lang.Math.*;
import static java.lang.System.out;
//import static java.lang.Integer;

public class Ex29ImportingStatic {
    public static void main(String [] args){
        double a = random();
        double b = random();
        //Integer inums = 68, 65, 5, 56, 83, 17, 4, 9, 90, 78, 42, 10, 91, 34;

        out.println(PI);
        out.println( abs(-9));
        out.println( sqrt(2));
        out.println( min(a, b) + " is smaller." );
        out.println( max(a, b) + " is larger." );
        out.println( pow(a, b) ); // a raised to the power of b
        out.println( Math.sin(PI) );
        out.println( Math.cos(PI) );
        out.println( Math.tan(PI) );
        //out.println();

    }
}
