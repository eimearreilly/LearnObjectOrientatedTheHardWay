/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex8SphereCalc2 {
    double radius, area, vol;

    public void setRadius(double r){
        radius = r;
        area = 4*Math.PI*r*r;
        vol = 4*Math.PI*Math.pow(r,3) / 3.0;
    }

    public double getRadius(){
        return radius;
    }

    public double getSurfaceArea(){
        return area;
    }

    public double getVol(){
        return vol;
    }
}
