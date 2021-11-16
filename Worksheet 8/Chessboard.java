import java.util.ArrayList;

public class Chessboard {
    private ArrayList squares = new ArrayList();

    public Chessboard() {
        final int size = 8;
        this.squares = makeRows(size);
    }

    private ArrayList makeRows(final int size) {
        ArrayList rows = new ArrayList();
        for (int i = 0; i
                < size; i++) {
            rows.add(row(size));
        }
        return rows;
    }

    private ArrayList row(final int size) {
        ArrayList row = new ArrayList();
        for (int i = 0; i
                < size; i++) {
            row.add("");
        }
        return row;
    }

    private int getColumn(final char column) {
        switch (column) {
        case 'a':
            return 0;
        case 'b':
            return 1;
        case 'c':
            return 2;
        case 'd':
            return 3;
        case 'e':
            return 4;
        case 'f':
            return 5;
        case 'g':
            return 6;
        case 'h':
            return 7;
        default:
            return -1;
        }
    }

    public boolean setPiece(final String piece, final char col, final int row) {
        int colNum = getColumn(col);
        if (colNum
                != -1
                && row
                        >= 0
                && row
                        <= 8) {
            ((ArrayList) this.squares.get(row
                    - 1)).set(colNum, piece);
            return true;
        } else {
            return false;
        }

    }

    public String getPiece(final char col, final int row) {
        int colNum = getColumn(col);
        if (colNum
                != -1
                && row
                        >= 0
                && row
                        <= 8) {
            return (String) ((ArrayList) this.squares.get(row
                    - 1)).get(colNum);
        } else {
            return "";
        }
    }
}
