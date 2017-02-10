import java.util.ArrayList;

public class Ex20ListsOfPrimitives {
    public static void main(String[] args){
        ArrayList<String> hats = new ArrayList<String>();

        hats.add("fez");
        hats.add("bowler");
        hats.add("beanie");
        hats.add("western");
        hats.add("fedora");

        System.out.println(hats);

        String jumble = "";
        for (String s:hats){
            jumble += s;
        }
        System.out.println("All together now: "+jumble);

        ArrayList<Integer> bins = new ArrayList<Integer>();

        bins.add(new Integer(1));
        bins.add(new Integer(3));
        bins.add(new Integer(3));
        bins.add(new Integer(1));

        bins.add(1);
        bins.add(4);
        bins.add(6);
        bins.add(4);
        bins.add(1);

        System.out.println(bins);

        int total = 0;
        for (Integer N: bins){
            int n = N.intValue();
            total += n;
        }
        System.out.println("The total is "+total);

        total=0;
        for(int n: bins){
            total += n;
        }


        System.out.println("The total is still " + total);

        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('z'); // auto-boxes char

        // Unbox letters and get 'z' into a char
        char eimear_test = letters.get(0);

        System.out.println(eimear_test + " test yo");

        ArrayList<Double> weights = new ArrayList<Double>();
        weights.add(0.14); // auto-boxes double
        double ch1_weights = weights.get(0);
        System.out.println(ch1_weights);

        ArrayList<Boolean> dealt = new ArrayList<Boolean>();
        while ( dealt.size() < 52 )
            dealt.add(false); // auto-boxes boolean


        // Exercises
        // Display value of Long.MAX_VALUE and Integer.MAX_VALUE and Integer.parseInt()
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Integer.parseInt("1233"));

        ArrayList<Long> longExample = new ArrayList<>();
        longExample.add(2435245L);
        longExample.add(24435245L);
        longExample.add(244435245L);

        System.out.println(longExample);



        //System.out.println(bins.§);
    }
}
