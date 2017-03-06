/**
 * Created by eimearreilly on 10/02/2017.
 */
public class Ex41DropGamePiece implements Ex41Locatable, Comparable<Ex41DropGamePiece>, Ex41Translatable {

    private Ex41Location loc;
    private String symbol;

    public Ex41DropGamePiece(int r, int c, String sym) {
        this(new Ex41Location(r, c), sym);
    }

    public Ex41DropGamePiece(Ex41Location loc, String sym) {
        this.loc = loc;
        symbol = sym;
    }

    public Ex41Location getLocation() {
        return loc;
    }

    public String getSymbol() {
        return symbol;
    }

    public int compareTo(Ex41DropGamePiece other) {
        return loc.compareTo(other.loc);
    }

    public void translate(int dr, int dc) {
        loc.row += dr;
        loc.col += dc;
    }

    public String toString() {
        return "DropGamePiece " + symbol + " at " + loc;
    }

    // Implement an equals() method for the DropGamePiece that returns true if the two pieces have the same symbol
    // and the same Location. You must use the Location's compareTo() method to do it and remember the equals() is passed an Object that
    // it must cast.

    //public boolean equals(){
    //  if ( getSymbol() == other symbol && loc.compareTo(other.loc){
    //      return true;
    //   }
    //   else {
    //       return false;
    //    }
}

