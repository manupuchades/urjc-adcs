package usantatecla.draughts.views;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import usantatecla.draughts.controllers.InteractorController;
import usantatecla.draughts.models.Coordinate;
import usantatecla.draughts.models.Pawn;
import usantatecla.draughts.models.Piece;

public class GameViewTest {

    private static final int DIMENSION = 8;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Mock
    private InteractorController interactorController;

    @InjectMocks
    private GameView sut;

    @Before
    public void before(){
        System.setOut(new PrintStream(outputStreamCaptor));
        initMocks(this);
    }

    @Test(expected = AssertionError.class)
    public void givenSUTWhenWriteWithNullControllerShouldThrowAssertionError(){
        sut.write(null);
    }

    @Test
    public void givenSUTWhenWriteWithNullPiecesShouldPrintEmptyBoard(){
        when(interactorController.getDimension()).thenReturn(DIMENSION);
        sut.write(interactorController);
        assertThat(outputStreamCaptor.toString(), is(emptyBoard()));
    }

    @Test
    public void givenSUTWhenWriteWithWhitePawnInAllCordinatesShouldPringFullBoard(){
        Piece piece = mock(Pawn.class);
        when(piece.getCode()).thenReturn("n");

        when(interactorController.getDimension()).thenReturn(DIMENSION);
        when(interactorController.getPiece(any(Coordinate.class))).thenReturn(piece);

        sut.write(interactorController);
        assertThat(outputStreamCaptor.toString(), is(fullBoard()));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    private String emptyBoard(){
        return  " 12345678\r\n" +
                "1        1\r\n" +
                "2        2\r\n" +
                "3        3\r\n" +
                "4        4\r\n" +
                "5        5\r\n" +
                "6        6\r\n" +
                "7        7\r\n" +
                "8        8\r\n" +
                " 12345678\r\n";
    }

    private String fullBoard(){
        return  " 12345678\r\n" +
                "1nnnnnnnn1\r\n" +
                "2nnnnnnnn2\r\n" +
                "3nnnnnnnn3\r\n" +
                "4nnnnnnnn4\r\n" +
                "5nnnnnnnn5\r\n" +
                "6nnnnnnnn6\r\n" +
                "7nnnnnnnn7\r\n" +
                "8nnnnnnnn8\r\n" +
                " 12345678\r\n";
    }

}
