import java.util.Scanner;
import java.io.File;

public class Ex39BuddyTester {
    public static void main(String[] args) throws Exception {

        int correct = 0;
        int total = 0;
        Scanner in = new Scanner(new File("datafiles/buddytests.txt"));
        while (in.hasNext()) {
            String name1 = in.next();
            int age1 = in.nextInt();
            String name2 = in.next();
            int age2 = in.nextInt();
            int wanted = in.nextInt();

            total++;
            int got = test(name1, age1, name2, age2);
            if (got == wanted)
                correct++;
            else {
                System.out.println("\t" + name1 + "-" + age1 + " compared with ");
                System.out.print(name2 + "-" + age2 + " should have given ");
                System.out.println(wanted + ", but I got " + got + " instead.");
            }
        }
        in.close();
        System.out.println(correct + " out of " + total + " tests passed.");

    }

        public static int test(String n1, int a1, String n2, int a2) {
            Ex39Buddy one = new Ex39Buddy(n1, a1);
            Ex39Buddy two = new Ex39Buddy(n2, a2);
            int num = one.compareTo(two);
            if(num==0 ) return 0;
            return (num / Math.abs(num)); }
    }

