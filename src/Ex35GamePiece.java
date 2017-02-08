public class Ex35GamePiece {
    protected int r, c;
    protected Ex35Gameboard board;
    protected String symbol;

    public Ex35GamePiece(){
        r = c = 0;
        board = null;
        symbol = "@";
    }

    public Ex35GamePiece(int r, int c, String symbol){
        this.r = r;
        this.c = c;
        this.board = null;
        this.symbol = symbol;
    }

    public boolean addSelfToBoard(Ex35Gameboard board){
        if ( board.canAdd(r,c) && ! isOnBoard() && board.get(r,c) == null ) {
            this.board = board; board.add(this,r,c); return true;
        }
        return false;
    }

    public boolean isOnBoard() {
        return board != null && board.get(r,c) == this;
    }
    public void removeSelfFromBoard() { if ( isOnBoard() ) {
        board.remove(r,c);
        board = null; }
    }
    public int getRow() { return r; }
    public int getCol() { return c; }
    public String getSymbol() { return symbol; }
    public String toString() {
        return "GamePiece at (" + r + ", " + c + ")";
    }
}
