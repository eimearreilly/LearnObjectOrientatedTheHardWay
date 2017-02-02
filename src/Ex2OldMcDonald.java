/**
 * Created by eimearreilly on 01/02/2017.
 */

class Cow {
    public void moo(){
        System.out.println("Cow says moo.");
    }
}

class Pig {
    public void oink(){
        System.out.println("Pig says oink.");
    }
}

class Duck {
    public void quack(){
        System.out.println("Duck says quack.");
    }
}

public class Ex2OldMcDonald {
    public static void main( String[] args ) {
        Cow maudine = new Cow();
        Cow pauline = new Cow();
        maudine.moo();
        pauline.moo();

        Pig snowball = new Pig();
        snowball.oink();
        snowball.oink();
        Duck ferdinand = new Duck();
        ferdinand.quack();

        // Instantiate a new object and call its method.
        Duck donaldDuck = new Duck();
        donaldDuck.quack();
    }

}

// Moving the definition of the duck class below the oldmacdonald class means that the code doesn't compile and work.
