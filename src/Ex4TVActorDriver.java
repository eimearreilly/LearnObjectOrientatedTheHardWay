// Added third varialbe number of roles successfully.

public class Ex4TVActorDriver {
    public static void main( String[] args ) {
        Ex4TVActor a = new Ex4TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.numberOfRoles = 12;

        Ex4TVActor b = new Ex4TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.numberOfRoles = 10;

        Ex4TVActor c = new Ex4TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.numberOfRoles = 4;

        System.out.println( a.name + " played " + a.role + ", "+ a.numberOfRoles +" times");
        System.out.println( b.name + " played " + b.role + ", "+ b.numberOfRoles +" times");
        System.out.println( c.name + " played " + c.role + ", "+ c.numberOfRoles +" times");
    }

}
