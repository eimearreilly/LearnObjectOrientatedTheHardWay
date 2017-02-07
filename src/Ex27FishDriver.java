import java.util.ArrayList;

/**
 * Created by eimearreilly on 07/02/2017.
 */
public class Ex27FishDriver {
    public static void main(String [] args){
        String[] names = {"Wanda", "Dory", "Bruce", "Qwerty", "Blinky", "Lenny",
                "Flounder", "Mr. Limpet", "Mrs. Puff", "Moby Dick", "Freddi"};

        ArrayList<Ex27Fish> school = new ArrayList<Ex27Fish>();

        for(String n:names){
            Ex27Fish f = new Ex27Fish((n));
            school.add(f);
        }

        for(Ex27Fish f:school){
            System.out.println(f);
        }

        System.out.println();
        System.out.println(Ex27Fish.numCreated() + " Fish objects were created.");
    }
}
