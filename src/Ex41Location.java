/**
 * Created by eimearreilly on 10/02/2017.
 */
public class Ex41Location implements Comparable<Ex41Location> {
    public int row;
    public int col;

    public Ex41Location(){
        row = col = 0;
    }

    public Ex41Location(int r, int c){
        row = r;
        col = c;
    }

    public boolean equals(Object obj){
        Ex41Location other = (Ex41Location)obj;
        return this.row == other.row && this.col == other.col;
    }

    public int compareTo(Ex41Location other){
        if(this.row == other.row)
            return this.col - other.col;
        return this.row - other.row;
    }

    public Ex41Location below(){
        return new Ex41Location(this.row+1, this.col);
    }

    public Ex41Location above(){
        return new Ex41Location(this.row-1, this.col);
    }

    public Ex41Location left(){
        return new Ex41Location(this.row, this.col-1);
    }

    public Ex41Location right(){
        return new Ex41Location(this.row, this.col+1);
    }

    public String toString(){
        return "(" + row + ", " + col + ")";
    }




}
