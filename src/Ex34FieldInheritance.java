/**
 * Created by eimearreilly on 07/02/2017.
 */
public class Ex34FieldInheritance {

    private String first;
    protected String last;

    public Ex34FieldInheritance() {
        first = last = "";
    }

    public Ex34FieldInheritance( String first, String last ) {
        this.first = first;
        this.last = last;
    }

    public void setFirst( String s ) {
        first = s;
    }

    public void setLast( String s ) {
        last = s;
    }

    public String getFirst() { return first; }
    public String getLast()  { return last; }

    public String toString() {
        return first + " " + last;
    }
}