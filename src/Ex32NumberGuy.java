public class Ex32NumberGuy {
    private int number;

    public Ex32NumberGuy(){ number =0;}
    public Ex32NumberGuy(int number){ this.number = number; }
    public int getNumber(){return number; }
    public String toString(){ return "" + number; }

    //Exercise
    public void doubleMe(double d){
        d = d*2;
    }

    public void doubleYourself(){
        number = number*2;
    }

    public void changeThis(int q){
        q = q*2;
    }
}

