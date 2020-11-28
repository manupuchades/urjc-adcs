package usantatecla.draughts.views;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import usantatecla.draughts.CoordinateBuilder;
import usantatecla.draughts.controllers.PlayController;
import usantatecla.draughts.models.Color;
import usantatecla.draughts.models.Error;
import usantatecla.draughts.utils.Console;


public class PlayViewTest {

	@Mock
    private PlayController playController;

    @Mock
    private Console console;

    @InjectMocks
    private PlayView sut;

    @Before
    public void before(){
        initMocks(this);
    }

    @Test(expected = AssertionError.class)
    public void givenSUTWhenInteractWithNullControllerThenShouldThrowAssertionError(){
        sut.interact(null);
    }

    @Test
    public void givenSUTWhenInteractWithCancelOperationThenShouldCancelAndExit(){
        when(playController.getColor()).thenReturn(Color.WHITE);
        when(console.readString(anyString())).thenReturn("-1");

        sut.interact(playController);
        verify(playController).cancel();
    }

    @Test
    public void givenSUTWhenInteractWithBadFormatAndCancellingLaterThenShouldReadCoordinatesTwiceAndExit(){
        when(playController.getColor()).thenReturn(Color.WHITE);
        when(console.readString(anyString()))
                .thenReturn("asdf")
                .thenReturn("-1");

        sut.interact(playController);
        verify(console, times(2)).readString(anyString());
        verify(playController).cancel();
    }

    @Test
    public void whenInteractFirstWithWrongAndThenWithRightFormatButLosingGame_ThenShouldReadCoordinatesTwiceAndExit(){
        when(playController.getColor()).thenReturn(Color.WHITE);
        when(console.readString(anyString()))
                .thenReturn("12.34")
                .thenReturn("34.56");
        when(playController.move(any()))
                .thenReturn(Error.EMPTY_ORIGIN)
                .thenReturn(null);
        when(playController.isBlocked()).thenReturn(true);
        sut.interact(playController);
        verify(console, times(2)).readString(anyString());
        verify(playController).move(
                new CoordinateBuilder().row(2).column(3).build(),
                new CoordinateBuilder().row(4).column(5).build());
        verify(console).writeln("Derrota!!! No puedes mover tus fichas!!!");
    }


}
