
public class Ex12RectangleDriver {
    public static void main(String [] args){
        // Rectangle r = new Rectangle();
        // r. length = 10;
        // r.width = 5;

        Ex12Rectangle r = new Ex12Rectangle(10, 5);
        Ex12Rectangle r2 = new Ex12Rectangle(1, 5);
        Ex12Rectangle r3 = new Ex12Rectangle(100, 5);

        System.out.println("The area of r is " + r.getArea());
        System.out.println("The area of r2 is " + r2.getArea());
        System.out.println("The area of r3 is " + r3.getArea());
    }
}
