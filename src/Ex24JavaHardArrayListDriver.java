public class Ex24JavaHardArrayListDriver {
    public static void main(String[] args){
        Ex24JavaHardArrayList<String> hats = new Ex24JavaHardArrayList<>();

        hats.add("fez");
        hats .add("bowler");
        hats .add("beanie");
        hats .add("western");
        hats .add("fedora");

        System.out.println(hats);

        String jumble = "";
        for( int i=0; i<hats.size(); i++){
            jumble += hats.get(i);
        }
        System.out.println("All together now: " + jumble);

        Ex24JavaHardArrayList<Integer> bins = new Ex24JavaHardArrayList<>();

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
        for( int i=0; i<bins.size(); i++){
            total += bins.get(i);
        }
        System.out.println("The total is " + total);

        Ex24JavaHardArrayList<Character> letters = new Ex24JavaHardArrayList<>();
        letters.add('z'); // auto-boxes char

        Ex24JavaHardArrayList<Double> weights = new Ex24JavaHardArrayList<>();
        weights.add(0.14); // auto-boxes double
        Ex24JavaHardArrayList<Boolean> dealt = new Ex24JavaHardArrayList<>();
        while ( dealt.size() < 52 )
            dealt.add(false); // auto-boxes boolean

    }
}
