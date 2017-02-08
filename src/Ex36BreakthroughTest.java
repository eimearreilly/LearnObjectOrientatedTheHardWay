public class Ex36BreakthroughTest {
    public static void main(String [] args){
        Ex36BreakthroughBoard board = new Ex36BreakthroughBoard();

        board.get(6,3).move(0);
        board.createPieceAt(4,4,false);
        board.createPieceAt(4,2,true);

        System.out.println("\n" + board);
        System.out.println("Can move left: " + board.get(5,3).canMove(-1));
        System.out.println("Can move straight: " + board.get(5,3).canMove(0));
        System.out.println("Can move right: " + board.get(5,3).canMove(1));
    }
}
