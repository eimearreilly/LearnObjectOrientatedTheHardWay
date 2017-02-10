/**
 * Created by eimearreilly on 08/02/2017.
 */
public class Ex38InterfaceDriver {
    public static void main(String [] args){
        Ex38ArbitraryInterface a1 = new Ex38InterfacePleaser();
        Ex38ArbitraryInterface a2 = new Ex38InterfacePleaser2();
        Ex38ArbitraryInterface a3 = new Ex38InterfacePleaser3();

        a1.doSomething(5);
        a2.doSomething(5);
        a3.doSomething(5);

        System.out.println(a1.getNumber());
        System.out.println(a2.getNumber());
        System.out.println(a3.getNumber());
    }
}
