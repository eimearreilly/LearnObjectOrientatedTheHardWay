/**
 * Created by eimearreilly on 02/02/2017.
 */
public class EX13DogDriver {
    public static void main(String [] args){
        Ex13Dog A = new Ex13Dog();

        Ex13Dog pal = new Ex13Dog("Lassie", "Rough Collie",3,26);
        Ex13Dog spike = new Ex13Dog("Yeller", "Mastador",5,43);

        System.out.println( pal.getName() + " is a " + pal.getBreed() + ".");
        System.out.println( spike.getName() + " is a " + spike.getBreed() + ".");

        System.out.println( pal.getEverything() );
        System.out.println( A.getEverything() );

        Ex13Dog extradog = new Ex13Dog("Spot", "Labrador", 2, 20);
        System.out.println(extradog.getName() + " is a "+ extradog.getBreed()+", "+extradog.getAge()+" years old, "+extradog.getWeight()+" kg.");

    }
}
