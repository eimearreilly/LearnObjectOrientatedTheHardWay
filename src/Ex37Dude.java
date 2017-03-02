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

    public boolean equals(Object obj) {
        try {
            Ex37Dude other = (Ex37Dude) obj;
            return (this.age == other.age && this.name.equals(other.name) && Math.abs(this.mass - other.mass) <= 0.1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public String toString(){
        return name + "|" + age + "|" + mass + "kg";
    }
}

