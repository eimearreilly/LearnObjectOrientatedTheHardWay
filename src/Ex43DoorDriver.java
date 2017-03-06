/**
 * Created by eimearreilly on 03/03/2017.
 */
public class Ex43DoorDriver {
    public static void main(String [] args) {
        // AbstractDoor d1

        Ex43GoodDoor d3 = new Ex43GoodDoor(false);
        System.out.println(d3);
        System.out.println("\tSound-proofing level: " + d3.soundProofing());
        d3.open();
        System.out.println(d3);
        System.out.println("\tSound-proofing level: " + d3.soundProofing());

        Ex43AbstractDoor d4 = new Ex43GoodDoor(true);
        System.out.println(d4);
        System.out.println("\tSound-proofing level: " + d4.soundProofing());

        Ex43AbstractDoor d5 = new Ex43WeakDoor(false);
        System.out.println(d5);
        System.out.println("\tSound-proofing level: " + d4.soundProofing());


    }
}
