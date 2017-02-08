public class Ex33Square extends Ex33Rect{
    public Ex33Square(){
        super();
    }

    public Ex33Square(double side){
        super(side, side);
    }

    public String toString(){
        return "Square, " + this.getLength() + "x" + super.getLength();
    }
}
