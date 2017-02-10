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
