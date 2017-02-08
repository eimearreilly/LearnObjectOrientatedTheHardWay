import java.util.Scanner;

public class Ex35TicTacGame {
    public static void main( String[] args ) {
        Ex35TicTacBoard board = new Ex35TicTacBoard();
        Scanner kb = new Scanner(System.in);
        int r, c;
        do {
            System.out.println("\n"+board);
            System.out.print("'"+ board.currentPlayer() +"', your turn: "); r = kb.nextInt();
            c = kb.nextInt();
            if ( ! board.canAdd(r,c) ) {
                System.out.println("\nSorry, you can't go there. Try again.");
                continue; }
            Ex35TicTacPiece XO = new Ex35TicTacPiece(r, c);
            XO.addSelfToBoard(board); } while ( !board.isOver() );
        System.out.println("\n"+board);
        if ( board.isWinner("X") ) System.out.println("X wins!");
        else if ( board.isWinner("O") ) System.out.println("O wins!");
        else
            System.out.println("It's a tie!");

    }
}
