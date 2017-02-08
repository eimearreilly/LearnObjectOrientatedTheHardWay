public class Ex34FieldInheritanceDriver {
    public static void main( String[] args ) {
        Ex34FieldInheritance f = new Ex34FieldInheritance("Bill", "Brasky");
        System.out.println(f);

        Ex34FieldInheritanceSub g = new Ex34FieldInheritanceSub("Turkish", "Delight");
        System.out.println(g);
        g.test();
        System.out.println(g);
    }
}
