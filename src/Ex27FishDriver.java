import java.util.ArrayList;

/**
 * Created by eimearreilly on 07/02/2017.
 */
public class Ex27FishDriver {
    public static void main(String[] args) {
        String[] names = {"Wanda", "Dory", "Bruce", "Qwerty", "Blinky", "Lenny",
                "Flounder", "Mr. Limpet", "Mrs. Puff", "Moby Dick", "Freddi"};
        String[] colors = {"Red", "Blue"};

        ArrayList<Ex27Fish> school = new ArrayList<Ex27Fish>();

        int i = 0;
        for (String n : names) {
//            String col;
//            if(i%2 == 0){
//                col = "red";
//            }
//            else{
//                col = "blue";
//            }
//            Ex27Fish f = new Ex27Fish(n, col);

            Ex27Fish f = new Ex27Fish(n, colors[i % 2]);
            i++;
            school.add(f);
        }

        for (Ex27Fish f : school) {
            System.out.println(f);
        }

        System.out.println();
        System.out.println(Ex27Fish.numCreated() + " Fish objects were created.");
    }
}