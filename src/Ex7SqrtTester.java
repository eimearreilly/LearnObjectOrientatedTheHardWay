/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex7SqrtTester {
    public static void main(String[] args) {

        Ex7SquareRootFinder sqrt = new Ex7SquareRootFinder();

        double max = 0, maxN = 0;
        double fakeRoot, realRoot, diff;

        System.out.print("Testing square root algorithm.. ");
        double totalError = 0;
        for (double n = 0; n <= 2000; n += 0.01) {
            sqrt.setNumber(n);
            fakeRoot = sqrt.getRoot();
            realRoot = Math.sqrt(n);
            diff = Math.abs(fakeRoot - realRoot);

            totalError = totalError + diff;
        }
        System.out.println("Total error is: " + totalError);
    }

}

// Totalerror = NaN
// When iteration is 8 this doesn't change the problem is in the finder class
// when x = 0 it is dividing the iterations and this is not a number. Therefore NaN
// In order to fix this error you would need to add a condition for 0.