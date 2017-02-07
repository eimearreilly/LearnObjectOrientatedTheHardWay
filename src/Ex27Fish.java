/**
 * Created by eimearreilly on 07/02/2017.
 */

//Make it so that Fish objects also have a String specifying their color ("red" or "blue"),
// and make it so the if the current Fish was red, then the next one will be blue.
// You may add a second static variable to help accomplish this, though it is possible to do it without one.
// Make sure to add the color to the toString() method.

public class Ex27Fish {
    private String name;
    private int id;
    private static int count = 0;
    private String color;

    public Ex27Fish(String name){
        this.name = name;
        count ++;
        id = count;
    }

    public String toString(){
        return name + ",fish #" + id + " of " + count;
    }

    public static int numCreated(){
        return count;
    }
}
