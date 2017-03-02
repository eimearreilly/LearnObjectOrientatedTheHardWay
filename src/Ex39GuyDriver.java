import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex39GuyDriver {
    public static void main(String[] args){

        ArrayList<Ex39Guy> list = getListFromFile("datafiles/buddytests.txt");
        System.out.println(list + "\n");

        Collections.sort(list);
        for(Ex39Guy g : list)
            System.out.println(g);

        // Using indexOf() ArrayList method to find the index of a particular Guy object in the list
        Ex39Guy testGuy = new Ex39Guy("Eimear",24);
        int testint = list.indexOf(testGuy);
        System.out.println(testint);
        Ex39Guy testGuy2 = new Ex39Guy("Alice", 25);
        int testint2 = list.indexOf(testGuy2);
        System.out.println(testint2);

    }

    public static ArrayList<Ex39Guy> getListFromFile(String filename){
        ArrayList<Ex39Guy> list = new ArrayList<>();
        Scanner in = null;

        try{
            in = new Scanner(new java.io.File(filename));
        }
        catch (java.io.FileNotFoundException e){
            System.out.println("Couldn't open 'buddytests.txt': " + e);
            System.exit(1);
        }

        while(in.hasNext() ){
            Ex39Guy g = new Ex39Guy(in.next(), in.nextInt());
            if(!list.contains(g))
                list.add(g);
            in.next();
            in.nextInt();
            in.nextInt();
        }
        in.close();
        return list;



    }
}
