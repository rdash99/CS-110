public class MainChess {
    public static void main(String[] args) {
        Chessboard board = new Chessboard();
        board.setPiece("White King", 'a', 4);
        board.setPiece("Black Queen", 'h', 8);
        System.out.println(board.getPiece('a', 4));
        System.out.println(board.getPiece('h', 8));
    }
}
