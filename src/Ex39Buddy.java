/**
 * Created by eimearreilly on 08/02/2017.
 */
public class Ex39Buddy implements Ex39Comparable {
    private int age;
    private String name;

    public Ex39Buddy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        Ex39Buddy other = (Ex39Buddy)obj;
        return (this.age == other.age && this.name.equals(other.name));
    }

    public int compareTo(Object obj){
        Ex39Buddy other = (Ex39Buddy)obj;
        if(this.name.equals(other.name))
            return (this.age - other.age);
        else
            return this.name.compareTo(other.name);
    }

    public String toString(){
        return name + "-" + age;
    }
}
