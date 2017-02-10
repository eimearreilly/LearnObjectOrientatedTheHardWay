/**
 * Created by eimearreilly on 08/02/2017.
 */
public class Ex37DudeDriver {
    public static void main(String[] args) {
        Ex37Dude one = new Ex37Dude("Mitch", 39, 70.55);
        Ex37Dude two = new Ex37Dude("Mitch", 39, 66.9);
        Ex37Dude three = one;
        Ex37Dude four = new Ex37Dude("Curly", 71, 101.42);

        if (one.equals(two))
            System.out.println(one + " equals " + two);
        else
            System.out.println(one + " does not equal " + two);

        if (one.equals(three))
            System.out.println(one + " equals " + three);
        else
            System.out.println(one + " does not equal " + three);

        if (one.equals(four))
            System.out.println(one + " equals " + four);
        else
            System.out.println(one + " does not equal " + four);
            System.out.println();

        if (one == two)
            System.out.println(one + " == " + two);
        else
            System.out.println(one + " != " + two);

        if (one == three)
            System.out.println(one + " == " + three);
        else
            System.out.println(one + " != " + three);
    }
}
