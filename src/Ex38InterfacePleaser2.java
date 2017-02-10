/**
 * Created by eimearreilly on 08/02/2017.
 */
public class Ex38InterfacePleaser2 implements Ex38ArbitraryInterface {
    private int max;

    public Ex38InterfacePleaser2(){
        this(0);
    }

    public Ex38InterfacePleaser2(int max){
        this.max = max;
    }

    public void doSomething(int somethingOtherThanN){

    }

    public double getNumber(){
        return Math.random()*max;
    }
}
