public class Ex35Gameboard {
    protected Ex35GamePiece[][] g;
    public Ex35Gameboard( int rows, int columns ) {
        g = new Ex35GamePiece[rows][columns];
    }

    public void add( Ex35GamePiece a, int r, int c ) {
        if ( ! canAdd(r,c) )
            return;
        g[r][c] = a; }

    public boolean canAdd( int r, int c ) {
        return ( 0 <= r && r < g.length && 0 <= c && c < g[0].length );
    }

    public Ex35GamePiece get( int r, int c ) {
        return g[r][c];
    }

    public void remove(int r, int c) {
        g[r][c] = null;
    }
    public String toString() { String out = "";
        for ( int r=0; r<g.length; r++ ) {
            for (int c=0; c<g[0].length; c++){
                if (g[r][c] == null)
                    out += ".";
                else
                    out += g[r][c].getSymbol();
            }
            out += "\n";
        }
        return out;
    }
}
