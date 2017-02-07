public class Ex23PointSwapperDriver {
    public static void main(String [] args){
        Ex23PointSwapperInt pi = new Ex23PointSwapperInt(3,5);

        System.out.println("before: " + pi);
        pi.swap();
        System.out.println("after: " + pi);
        pi.swap();
        System.out.println( "after after: " + pi );

        Ex23PointSwapperDouble pd = new Ex23PointSwapperDouble(1.1, 4.4);

        System.out.println( "\nbefore: " + pd);
        pd.swap();
        System.out.println( "after: " + pd );
        pd.swap();
        System.out.println( "after after: " + pd);

        Ex23PointSwapper<Integer> pg1 = new Ex23PointSwapper<>(2, 6);
        Ex23PointSwapper<Double> pg2 = new Ex23PointSwapper<>(1.3, 5.7);

        System.out.println( "\nbefore: " + pg1 );
        pg1.swap();
        System.out.println( "after: " + pg1 );
        pg1.swap();
        System.out.println( "after after: " + pg1 );

        System.out.println( "\nbefore: " + pg2 );
        pg2.swap();
        System.out.println( "after: " + pg2 );
        pg2.swap();
        System.out.println( "after after: " + pg2 );

        // Check comparison method
        System.out.println(pg1.comparison());
    }
}
