/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex12Rectangle {

    private int length, width;

    public Ex12Rectangle(){
        length = width = 0;
    }
    public Ex12Rectangle( int l, int w){
        length = l;
        width = w;
    }

    public int getArea(){
        return length*width;
    }
}
