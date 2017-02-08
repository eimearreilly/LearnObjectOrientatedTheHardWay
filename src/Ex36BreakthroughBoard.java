/**
 * Created by eimearreilly on 08/02/2017.
 */
public class Ex36BreakthroughBoard extends Ex35Gameboard {
    public Ex36BreakthroughBoard(){
        super(8,8);
        for(int c=0; c<8; c++){
            createPieceAt(0,c,false);
            createPieceAt(1,c,false);
            createPieceAt(6,c,true);
            createPieceAt(7,c,true);
        }
    }

    @Override
    public Ex36BreakthroughPiece get(int r, int c){
        return (Ex36BreakthroughPiece)super.get(r,c);
    }

    public void createPieceAt(int r, int c, boolean isWhite){
        Ex36BreakthroughPiece bp = new Ex36BreakthroughPiece(r,c,isWhite);
        bp.addSelfToBoard(this);
    }

    public void movePiece(int curRow, int curCol, int newRow, int newCol){
        if(canAdd(curRow, curCol) && canAdd(newRow, newCol)){
            g[newRow][newCol] = g[curRow][curCol];
        }
    }

    public boolean isOver(){
        return isWinner("W") || isWinner("B");
    }

    public boolean isWinner(String symbol){
        int targetRow= symbol.equals("W") ? 0 : 7;
        for(int c = 0; c<8; c++)
            if(g[targetRow][c].getSymbol().equals(symbol))
                return true;
        return false;
    }

    @Override
    public String toString(){
        String out = "";
        for(int r=0; r<g.length; r++){
            out += "\t" + (g.length-r) + " ";
            for (int c=0; c<g[0].length; c++){
                if(g[r][c] == null)
                    out += ".";
                else
                    out += g[r][c].getSymbol();
            }
            out += "\n";
        }
        out +="\t ";
        for(int c=0; c<g[0].length; c++)
            out += (char)('A'+c);
        return out+"\n";
    }
}
