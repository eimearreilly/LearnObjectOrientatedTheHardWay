/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex7SquareRootFinder {
    double n;
    int iterations;

    public void setNumber( double number ) {
        n = number;
        iterations = 8;
        if ( n <10 )
            iterations ++;
    }

    public double getRoot(){
        if(n<=0){
            return 0;
        }
        double x = n/4;
        for( int i =0; i<iterations; i++){
            x = (x+(n/x))/2.0;
        }
        return x;
    }
}
