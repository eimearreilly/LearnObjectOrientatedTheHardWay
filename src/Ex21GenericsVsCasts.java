import java.util.ArrayList;

public class Ex21GenericsVsCasts {

    @SuppressWarnings("unchecked")
    public static void main(String [] args) {
        ArrayList objArr = new ArrayList();

        objArr.add("one");
        objArr.add("two");

        Object aa = objArr.get(0);
        Object bb = objArr.get(1);

        // String qq = objArr.get(0); won't work
        // String rr = objArr.get(1); won't work

        String ss = (String) objArr.get(0);
        String tt = (String) objArr.get(1);

        System.out.println(objArr);


        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("one");
        strArr.add("two");

        String s = strArr.get(0);
        String t = strArr.get(1);

        System.out.println(strArr);

        Object a = strArr.get(0); // this also works, because Strings are Objects
        Object b = strArr.get(1);

        //------------------------
        Integer i = new Integer(123);
        objArr.add(i);

        System.out.println(objArr);
        //String uu = (String)objArr.get(2); // Yes throws runtime error

        //strArr.add(1); // won't compile

        //Add a line of code toward the bottom that uses a cast to retrieve the Integer object out of objarr.
        System.out.println(objArr.get(2));

        //Write an if statement that compares s with ss. The statement is true.
        if (s == ss) {
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }
}
