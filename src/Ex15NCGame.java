import java.util.Scanner;

/**
 * Created by eimearreilly on 03/02/2017.
 */
public class Ex15NCGame {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);

        String p = "X";
        Ex15NoughtsCrossesObject ttt = new Ex15NoughtsCrossesObject();
        int r, c;

        while( !(ttt.isWinner("X")) || ttt.isWinner("O") || ttt.isFull()){
            System.out.println(ttt);
            System.out.print("'"+p+"', choose your location (row column): ");
            r = kb.nextInt();
            c = kb.nextInt();

            while( !ttt.isValid(r,c) || ttt.isTaken(r,c)){
                if(ttt.isValid(r,c) == false)
                    System.out.println("Not a valid location, try again");
                else if ( ttt.isTaken(r,c) )
                    System.out.println("Location already full. Try again.");

                System.out.print( "Choose your location (row column): " );
                r = kb.nextInt();
                c = kb.nextInt();
            }
            ttt.playMove( p, r, c );
            if ( p.equals("X") )
                p = "O";
            else
                p = "X";
        }
        System.out.println(ttt);
        if ( ttt.isWinner("X") )
            System.out.println("X is the winner!");
        else if ( ttt.isWinner("O") )
            System.out.println("O is the winner!");
        else if ( ttt.isCat() )
            System.out.println("The game is a tie.");
    }
}

