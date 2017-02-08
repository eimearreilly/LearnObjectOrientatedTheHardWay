public class Ex33BasicInheritance {
    public static void main(String [] args){
        Ex33Rect rec1 = new Ex33Rect(4,5);
        System.out.println(rec1);
        System.out.println("\tArea: " + rec1.getArea());
        System.out.println("\tPerimeter: " + rec1.getPerimeter());

        Ex33Square sq1 = new Ex33Square(3);
        System.out.println("\n"+sq1);
        System.out.println("\tArea: " + sq1.getArea());
        System.out.println("\tPerimeter: " + sq1.getPerimeter());

        Ex33Rect r = new Ex33Rect();
        Ex33Rect s = new Ex33Square(2);
        System.out.println("\n" + r + ", and " + s);
        r=s;
        System.out.println("\nHere is my rectangle: " + r);

        // Sotre rect1 into the variable s
        //s = rect1; //doesn't work
    }
}
