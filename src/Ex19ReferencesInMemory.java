/**
 * Created by eimearreilly on 03/02/2017.
 */

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

class Example{

}

public class Ex19ReferencesInMemory {
    public static void main(String[] args){

        int age = 41;
        String name = "Gosling";

        int[] digits = {3,1,4,1,5,9,2};
        Scanner kb = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        Integer year = new Integer(1995);
        Object obj = new Object();
        Example ex = new Example();

        System.out.println(digits);
        System.out.println(obj);
        System.out.println(ex);
        System.out.println();

        String[] names = {"John", "Paul", "George", "Ringo", "Brian"};
        System.out.println(names);

        System.out.println(arr);
        System.out.println(year);
    }
}
