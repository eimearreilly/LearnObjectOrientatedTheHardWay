/**
 * Created by eimearreilly on 03/03/2017.
 */
public class Ex43GoodDoor extends Ex43AbstractDoor {

    public Ex43GoodDoor(boolean b) {
        super(b);
    }

    public double soundProofing(){
        if(isOpen)
            return 0;
        else
            return 8.5;
    }
}
