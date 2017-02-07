import javax.xml.bind.DatatypeConverter;
import java.util.Arrays;
import java.util.Random;
public class Ex25ThingySorterDriver {
    public static void main(String [] args){

        long start, stop;
        Integer[] inums = {68, 65, 5, 56, 83, 17, 4, 9, 90, 78, 42, 10, 91, 34};
        Double[] drums = {12.1, 45.7, 43.9, 7.0, 1.5, 13.7, 19.6, 49.1, 29.7};

        Ex25ThingySorter<Integer> sort1 = new Ex25ThingySorter<>(inums);
        System.out.println(Arrays.toString(inums));
        System.out.println("Sorted? " + sort1.isSorted());
        sort1.exchangeSort();
        System.out.println(Arrays.toString(inums));
        System.out.println("Sorted? " + sort1.isSorted() + "\n");

        Ex25ThingySorter<Double> sort2 = new Ex25ThingySorter<>(drums);
        System.out.println(Arrays.toString(drums));
        System.out.println( "Sorted? " + sort2.isSorted() );
        sort2.exchangeSort();
        System.out.println( Arrays.toString(drums) );
        System.out.println( "Sorted? " + sort2.isSorted() );

        Random gen = new Random();
        Integer[] inums2 = new Integer[50000];
        Integer[] inums2copy = new Integer[50000];
         for ( int i=0; i<inums2.length; i++ ) {
            inums2[i] = gen.nextInt(1000);
            inums2copy[i] = inums2[i];
         }
    }
}
