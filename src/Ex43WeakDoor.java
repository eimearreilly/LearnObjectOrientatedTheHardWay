/**
 * Created by eimearreilly on 03/03/2017.
 */
public class Ex43WeakDoor extends Ex43AbstractDoor {

    public Ex43WeakDoor(boolean b) {
        super(b);
    }

    public double soundProofing(){
        if(isOpen)
            return 2;
        else
            return 9;
    }
}