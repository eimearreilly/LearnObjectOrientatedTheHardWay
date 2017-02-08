public class Ex35TicTacPiece extends Ex35GamePiece {
    private static int whichOne = 0;

    public Ex35TicTacPiece(int r, int c) {
        super(r, c, whichOne % 2 == 0 ? "X" : "O");
        whichOne++;
    }
}