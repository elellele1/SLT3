package at.technikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        while (true) {
            game.printBoard();
            System.out.println("Spieler " + game.getCurrentPlayer() + ", gib deine Zeile (0-2) ein:");
            int row = scanner.nextInt();
            System.out.println("Spieler " + game.getCurrentPlayer() + ", gib deine Spalte (0-2) ein:");
            int col = scanner.nextInt();

            if (game.placeMove(row, col)) {
                if (game.checkWin()) {
                    game.printBoard();
                    System.out.println("Spieler " + game.getCurrentPlayer() + " gewinnt!");
                    break;
                } else if (game.isBoardFull()) {
                    game.printBoard();
                    System.out.println("Unentschieden!");
                    break;
                } else {
                    game.changePlayer();
                }
            } else {
                System.out.println("Ungültiger Zug. Versuche es nochmal.");
            }
        }

        scanner.close();
    }
}