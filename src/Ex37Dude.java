/**
 * Created by eimearreilly on 08/02/2017.
 */
public class Ex37Dude {
    private int age;
    private String name;
    private Double mass;

    public Ex37Dude(String name, int age, double mass){
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    // Adding the try and exception to equals method
    @Override
    /*public boolean equals(Object obj) {
        if (obj == null)
            return false;
        try {
            Ex37Dude other = (Ex37Dude) obj;
        }
        catch (ClassCastException e) {
            return false;
        }
        return (this.age == other.age && this.name.equals(other.name)) && Math.abs(this.mass - other.mass) <= 0.1);


    }*/
    public boolean equals(Object obj) {
        Ex37Dude other = (Ex37Dude) obj;
        return (this.age == other.age && this.name.equals(other.name) && Math.abs(this.mass - other.mass) <= 0.1);
    }

    @Override
    public String toString(){
        return name + "|" + age + "|" + mass + "kg";
    }
}

