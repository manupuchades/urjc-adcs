package usantatecla.draughts.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import usantatecla.draughts.CoordinateBuilder;

public abstract class PieceTest {

	private static final int MAX_ROW = Coordinate.getDimension() - 1;

    protected Piece piece;

    protected abstract void before();

    protected abstract Piece createPiece(Color color);

    @Test(expected = AssertionError.class)
    public void testGivenAPieceWhenCheckIsCorrectMovementWithFirstCoordinateIsNullThenThrowAssertionError() {
        this.piece.isCorrectMovement(Collections.EMPTY_LIST, 0, new Coordinate[]{null});
    }

    @Test(expected = AssertionError.class)
    public void testGivenAPieceWhenCheckIsCorrectMovementWithSecondCoordinateIsNullThenThrowAssertionError() {
        this.piece.isCorrectMovement(Collections.EMPTY_LIST, 0, new Coordinate[]{new CoordinateBuilder().build(), null});
    }

    @Test
    public void testGivenAPieceWhenCheckIsCorrectMovementWithCoordinatesNotOnDiagonalThenReturnNotDiagonalError() {
        assertEquals(Error.NOT_DIAGONAL,
                this.piece.isCorrectMovement(Collections.EMPTY_LIST, 0, createSameRowCoordinates()));
    }

    @Test
    public void testGivenAPieceWhenCheckIsLimitWithLastRowCoordinateAndWhitePieceThenReturnFalse() {
        assertFalse(this.createPiece(Color.WHITE).isLimit(new CoordinateBuilder().row(MAX_ROW).build()));
    }

    @Test
    public void testGivenAPieceWhenCheckIsLimitWithFirstRowCoordinateAndBlackPieceThenReturnFalse() {
        assertFalse(this.createPiece(Color.BLACK).isLimit(new CoordinateBuilder().build()));
    }

    @Test
    public void testGivenAPieceWhenCheckIsLimitWithFirstRowCoordinateAndBlackPieceThenReturnTrue() {
        assertTrue(this.createPiece(Color.BLACK).isLimit(new CoordinateBuilder().row(MAX_ROW).build()));
    }

    @Test(expected = AssertionError.class)
    public void testGivenAPieceWhenCheckIsAdvancedWithOriginCoordinateNullThenThrowsAssertionError() {
        this.piece.isAdvanced(null, null);
    }

    @Test(expected = AssertionError.class)
    public void testGivenAPieceWhenCheckIsAdvancedWithTargetCoordinateNullThenThrowsAssertionError() {
        this.piece.isAdvanced(new CoordinateBuilder().build(), null);
    }

    @Test
    public void testGivenAPieceWhenCheckIsAdvancedWithCoordinatesInSameRowThenReturnFalse() {
        Coordinate[] coordinates = createSameRowCoordinates();
        assertFalse(this.piece.isAdvanced(coordinates[0], coordinates[1]));
    }

    @Test
    public void testGivenAPieceWhenCheckIsAdvancedAndPieceIsWhiteAndNotAdvanceThenReturnFalse() {
        Coordinate[] coordinates = createOnDiagonalCoordinates(Color.WHITE, 1);
        assertFalse(this.createPiece(Color.WHITE).isAdvanced(coordinates[1], coordinates[0]));
    }

    @Test
    public void testGivenAPieceWhenCheckIsAdvancedAndPieceIsBlackAndNotAdvanceThenReturnFalse() {
        Coordinate[] coordinates = createOnDiagonalCoordinates(Color.BLACK, 1);
        assertFalse(this.createPiece(Color.BLACK).isAdvanced(coordinates[1], coordinates[0]));
    }

    protected static Coordinate[] createSameRowCoordinates() {
        return new Coordinate[]{
                new CoordinateBuilder().build(),
                new CoordinateBuilder().build()
        };
    }

    protected static Coordinate[] createOnDiagonalCoordinates(Color color, int distance) {
        List<Coordinate> coordinates = Arrays.asList(
                new CoordinateBuilder().build(),
                new CoordinateBuilder().row(distance).column(MAX_ROW - distance).build()
        );
        if (color == Color.WHITE) {
            Collections.reverse(coordinates);
        }
        return coordinates.toArray(new Coordinate[2]);
    }

}
