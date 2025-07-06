package at.technikum;

public class TicTacToe {

    private char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("Aktueller Spielstand:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("---+---+---");
            }
        }

        public void printBoard() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(" " + board[i][j]);
                    if (j < board[i].length - 1) {
                        System.out.print(" |");
                    }
                }
                System.out.println();
                if (i < board.length - 1) {
                    System.out.println("---+---+---");
                }
            }
            System.out.println();
        }

    }
}