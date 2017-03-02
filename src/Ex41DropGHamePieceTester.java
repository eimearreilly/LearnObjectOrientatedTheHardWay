import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by eimearreilly on 10/02/2017.
 */
public class Ex41DropGHamePieceTester {
    public static void main(String [] args){
        Ex41DropGamePiece one = new Ex41DropGamePiece(5,5,"A");
        Ex41Location oneLoc = one.getLocation();
        Ex41DropGamePiece two = new Ex41DropGamePiece(oneLoc.below(), "B");
        System.out.println(one + "\n" + two);
        two.translate(-1,0);
        System.out.println();
        System.out.println( one + "\n" + two );
        System.out.println( one.compareTo(two) );
    }
}
