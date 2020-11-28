package usantatecla.draughts.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PawnTest extends PieceTest{

	@Before
    public void before() {
        this.piece = new Pawn(Color.WHITE);
    }

    protected Piece createPiece(Color color) {
        return new Pawn(color);
    }

    @Test
    public void testGivenAPawnWhenCheckIsCorrectDiagonalMovementAndDoesNotAdvanceThenReturnNotAdvancedError() {
        assertEquals(Error.NOT_ADVANCED,
                this.piece.isCorrectDiagonalMovement(1, 0, createSameRowCoordinates()));
    }

}
