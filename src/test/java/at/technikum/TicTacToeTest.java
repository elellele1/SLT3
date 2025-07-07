package at.technikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testValidMove() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.makeMove(0, 0));
        assertEquals('X', game.getBoard()[0][0]);
    }

    @Test
    public void testInvalidMove() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0);
        assertFalse(game.makeMove(0, 0));
    }

    @Test
    public void testSwitchCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        char first = game.getCurrentPlayer();
        game.switchCurrentPlayer();
        assertNotEquals(first, game.getCurrentPlayer());
    }

    @Test
    public void testGameOverTrue() {
        TicTacToe game = new TicTacToe();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game.makeMove(i, j);
                game.switchCurrentPlayer();
            }
        }
        assertTrue(game.isGameOver());
    }

    @Test
    public void testGameOverFalse() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0);
        assertFalse(game.isGameOver());
    }
}

