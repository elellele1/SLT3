package at.technikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

      //feature/game-logic
        System.out.println("Willkommen bei Tic Tac Toe!");
        game.printBoard();

        while (!game.isGameOver()) {
            System.out.println("Spieler " + game.getCurrentPlayer() + ", gib deine Position ein (Zeile und Spalte von 0 bis 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                game.printBoard();
            } else {
                System.out.println("Ungültiger Zug, versuch es nochmal.");
            }
        }

        System.out.println("Spiel beendet!");
    }
}

