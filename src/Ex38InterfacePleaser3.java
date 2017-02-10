public class Ex38InterfacePleaser3 implements Ex38ArbitraryInterface {
    private int min;

    public Ex38InterfacePleaser3(){

    }

    public Ex38InterfacePleaser3(int min){
        this.min = min;
    }

    public int getMin(){return min;}

    public void doSomething(int somethingNew){

    }

    public double getNumber(){
        return Math.random()*min;
    }
}
