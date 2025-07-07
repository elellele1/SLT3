import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import at.technikum.TicTacToe;

public class TicTacToeTest {

    @Test
    public void testValidMove() {
        TicTacToe game = new TicTacToe();
        boolean result = game.makeMove(0, 0);
        assertTrue(result);
    }

    @Test
    public void testInvalidMove() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0); // Erster Zug ok
        boolean result = game.makeMove(0, 0); // Auf besetztes Feld
        assertFalse(result);
    }

    @Test
    public void testGameOverTrue() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0); // X
        game.makeMove(1, 0); // O
        game.makeMove(0, 1); // X
        game.makeMove(1, 1); // O
        game.makeMove(0, 2); // X gewinnt
        assertTrue(game.isGameOver());
    }

    @Test
    public void testGameOverFalse() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0);
        assertFalse(game.isGameOver());
    }

    @Test
    public void testSwitchCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        char current = game.getCurrentPlayer();
        game.switchCurrentPlayer();
        assertNotEquals(current, game.getCurrentPlayer());
    }
}
