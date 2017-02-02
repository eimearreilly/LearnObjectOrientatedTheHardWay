import java.util.zip.DeflaterOutputStream;

/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex9SphereCalc4 {
    private double radius, area, volume;

    // Constructor has the same name as the class. Constructors
    public Ex9SphereCalc4(double r){
        setRadius(r);
        area = 4*Math.PI*r*r;
        volume = 4*Math.PI*Math.pow(r,3) / 3.0;
    }

    public void setRadius(double r){
        radius = r;
        area = 4*Math.PI*r*r;
        volume = 4*Math.PI*Math.pow(r,3) / 3.0;
    }

    public double getRadius(){ return radius;}
    public double getArea() {return area;}
    public double getVolume() { return volume;}
}
