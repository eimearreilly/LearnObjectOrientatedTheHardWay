public class Ex35TicTacBoard extends Ex35Gameboard {
    private int numTurns;

    public Ex35TicTacBoard(){
        super(3,3);
        numTurns = 0;
    }

    @Override
    public boolean canAdd(int r, int c){
        return super.canAdd(r,c) && g[r][c] == null;
    }

    @Override
    public void add(Ex35GamePiece a, int r, int c){
        if(canAdd(r,c)){
            super.add(a,r,c);
            numTurns++;
        }
    }
    public String currentPlayer() {
        return numTurns%2 == 0 ? "X" : "O";
    }

    public boolean isWinner() {
        return isWinner("X") || isWinner("O");
    }

    public boolean isOver() {
        return isWinner() || numTurns == 9;
    }

    public boolean isWinner( String p ) {
        if ( winCheck(p, 0,0, 0,1, 0,2) )return true;
        if ( winCheck(p, 1,0, 1,1, 1,2) )return true;
        if ( winCheck(p, 2,0, 2,1, 2,2) )return true;
        if ( winCheck(p, 0,0, 1,0, 2,0) )return true;
        if ( winCheck(p, 0,1, 1,1, 2,1) )return true;
        if ( winCheck(p, 0,2, 1,2, 2,2) )return true;
        if ( winCheck(p, 0,0, 1,1, 2,2) )return true;
        if ( winCheck(p, 2,0, 1,1, 0,2) )return true;
        return false;
    }
    private boolean winCheck(String p, int a,int b, int c,int d, int e,int f) {
        if ( g[a][b] == null || g[c][d] == null || g[e][f] == null )
            return false;
        String A = g[a][b].getSymbol();
        String B = g[c][d].getSymbol();
        String C = g[e][f].getSymbol();
        return ( p.equals(A) && A.equals(B) && B.equals(C) );
    }

    // Method that's true when there have been 8 moves and the last remaining move wouldn't cause anyone to win, either.
    // Modify the game to skip that last turn when this occurs.
    //public boolean lastMove(){
        //for each position
            //if isempty
    // set to next player (X or O)
    // won = isWinner(board)
        // number of moves == 8 turn 9 will not result in a win
        //if(numTurns == 8 && isWinner())
            // Set position to null
        // return false
        //return true;
    //}


}
