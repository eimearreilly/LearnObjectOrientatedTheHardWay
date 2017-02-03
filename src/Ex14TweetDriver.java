/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex14TweetDriver {
    public static void main(String [] args){
        Ex14Tweet t = new Ex14Tweet("Thu Feb 19 20;29:00 +0000 2015", 8, true, 568507566168223744l, 2, false,
                "You can now buy 'Learn Java the Hard Way' using bitcoin! Probably!" + "\nThanks, @stripe ! #ljthw");

        System.out.println(t.toString() );
        System.out.println("\n----------------");
        System.out.println(t);
    }
}

// removing L from the long number results in an error message saying: integer number
// too large.

// making it a lowercase l works correctly and compile

// t and t.toString are the same now.