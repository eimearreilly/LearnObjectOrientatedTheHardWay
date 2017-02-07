import javax.xml.bind.DatatypeConverter;
import java.util.Arrays;
import java.util.Random;
public class Ex25ThingySorterDriver {
    public static void main(String [] args){

        long start, stop;
        Integer[] inums = {68, 65, 5, 56, 83, 17, 4, 9, 90, 78, 42, 10, 91, 34};
        Double[] drums = {12.1, 45.7, 43.9, 7.0, 1.5, 13.7, 19.6, 49.1, 29.7};
        // Change the driver code so that both ThingySorter objects get passed a reference to inums2.
        // Do you understand why the second sorter completes way too quickly?

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

        Ex25ThingySorter<Integer> sort2a = new Ex25ThingySorter<>(inums2);
        System.out.print( "\n" + inums2.length + " Integers sorted? " );
        System.out.println( sort2a.isSorted() );
        System.out.print( "Sorting..." );
        start = System.nanoTime();
        sort2a.exchangeSort();
        stop = System.nanoTime();
        System.out.println( "done." );
        System.out.print( inums2.length + " Integers sorted? " );
        System.out.println( sort2a.isSorted() );
        System.out.print( "Exchange sorting them took " );
        System.out.println( (stop-start)/1000/1000.0 + " milliseconds." );

        Ex25ThingySorter<Integer> sort2b = new Ex25ThingySorter<>(inums2copy);
        System.out.print( "\n" + inums2copy.length + " Integers sorted? " );
        System.out.println( sort2b.isSorted() );
        System.out.print( "Sorting..." );
        start = System.nanoTime();
        sort2b.quickSort();
        stop = System.nanoTime();
        System.out.println( "done." );
        System.out.print( inums2copy.length + " Integers sorted? " );
        System.out.println( sort2b.isSorted() );
        System.out.print( "Quick sorting them took " );
        System.out.println( (stop-start)/1000/1000.0 + " milliseconds." );
    }
}
