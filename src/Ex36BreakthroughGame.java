import static java.lang.System.out;
import java.util.Scanner;

public class Ex36BreakthroughGame {
    public static void main(String [] args){
        Ex36BreakthroughBoard board = new Ex36BreakthroughBoard();
        Scanner kb = new Scanner(System.in);
        String col;
        int row, r, c, colDir;
        String player = "W";
        boolean goLeft, goForward, goRight;

        do{
            out.println("\n" + board);
            out.print("'" + player + "', your turn: ");
            col = kb.next();
            row = kb.nextInt();

            r = 8-row;
            c = col.charAt(0) - 'A';

            Ex36BreakthroughPiece pick = board.get(r, c);
            if(pick == null || !pick.getSymbol().equals(player)){
                out.println("\nThere's no piece you can move there. Try again.");
                continue;
            }

            out.println();
            do{
                if(goLeft)
                    out.println("1) Move forward diagonally to the left");
                if(goForward)
                    out.println("2) Move forward straight ahead.");
                if (goRight)
                    out.println("3) Move forward diagonally to the right.");
                out.print("\nWhich move? ");
                colDir = kb.nextInt();
                if ( ! pick.canMove(colDir-2) )
                    out.println("\nThat wasn't one of the options. Try again."); }
            while ( ! pick.canMove(colDir-2) );
            pick.move(colDir-2);
            player = player.equals("W") ? "B" : "W";
        } while ( !board.isOver() );
        if ( board.isWinner("W") ) out.println("Player \"W\" wins!");
        else
            out.println("Player \"B\" wins!");
            }
        }
    }
}
