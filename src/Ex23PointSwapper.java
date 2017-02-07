/**
 * Created by eimearreilly on 07/02/2017.
 */
public class Ex23PointSwapper<Type> {
    private Type a, b;

    public Ex23PointSwapper(Type a, Type b){
        this.a = a;
        this.b = b;
    }

    public void swap(){
        Type temp = a;
        a = b;
        b = temp;
    }

    public Type getFirsst(){ return a; }
    public Type getLast(){ return  b; }

    public String toString(){
        return "(" + a + ", " + b + ")";
    }

    // comparison method, can pass two type variables
    public boolean comparison(){
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
}


