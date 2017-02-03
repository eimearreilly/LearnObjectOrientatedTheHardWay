/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex11FieldAccessDriver {
    public static void main(String [] args){
        Ex11FieldAccess j = new Ex11FieldAccess("Robert","Parker", "Butch");
        System.out.println(j.getFullName());

        j.setLast("Elliott");
        j.setFirst("Samuel");
        j.setNick("Sam");
        System.out.println(j.getFullName());

        j.setFirst("Avery");
        j.setLast("Markham");
        System.out.println(j.nick);
    }
}
