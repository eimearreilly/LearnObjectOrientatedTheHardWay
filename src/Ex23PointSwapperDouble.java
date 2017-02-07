public class Ex23PointSwapperDouble {
    private double a, b;

    public Ex23PointSwapperDouble(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void swap(){
        double temp = a;
        a = b;
        b = temp;
    }

    public double getFirsst(){ return a; }
    public double getLast(){ return  b; }

    public String toString(){
        return "(" + a + ", " + b + ")";
    }
}
