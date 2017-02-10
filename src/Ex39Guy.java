public class Ex39Guy implements Comparable<Ex39Guy> {
    private int age;
    private String name;

    public Ex39Guy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        Ex39Guy other = (Ex39Guy)obj;
        return (this.age == other.age && this.name.equals(other.name));
    }

    public int compareTo(Ex39Guy other){
        if(this.name.equals(other.name))
            return (this.age - other.age);
        else
            return this.name.compareTo(other.name);
    }

    public String toString(){
        return name + "-" + age;
    }
}
