package at.technikum;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("Spielbrett:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMove(int row, int col) {
        if (board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean checkWin() {
        // Horizontal, Vertikal und Diagonal überprüfen
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer &&
                            board[1][i] == currentPlayer &&
                            board[2][i] == currentPlayer)) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer &&
                        board[1][1] == currentPlayer &&
                        board[2][0] == currentPlayer);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
    public boolean isGameOver() {
        // Prüfe auf Sieg
        if (checkWin('X') || checkWin('O')) {
            return true;
        }

        // Prüfe auf Unentschieden (kein Feld mehr frei)
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false; // Noch nicht vorbei
                }
            }
        }

        return true; // Niemand hat gewonnen, aber alles voll = Unentschieden
    }

}
