/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex8SphereCalc {
    double radius;

    public void setRadius(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double getVolume(){
        return 4*Math.PI*Math.pow(radius, 3)/3.0;
    }

    public double getSurfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}
