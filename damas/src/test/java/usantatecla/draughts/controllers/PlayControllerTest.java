package usantatecla.draughts.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import usantatecla.draughts.CoordinateBuilder;
import usantatecla.draughts.models.Coordinate;
import usantatecla.draughts.models.Error;
import usantatecla.draughts.models.Game;
import usantatecla.draughts.models.State;

public class PlayControllerTest {

	@Mock
    private Game game;

    @Mock
    private State state;

    @Mock
    private CancelController cancelController;

    @Mock
    private MoveController moveController;

    @InjectMocks
    private PlayController sut;

    @Before
    public void before(){
        initMocks(this);
    }

    @Test(expected = AssertionError.class)
    public void givenSUTConstructorWhenNullGameShouldThrowAssertionError(){
        new PlayController(null, state);
    }

    @Test(expected = AssertionError.class)
    public void givenSUTConstructorWhenNullStateShouldThrowAssertionError(){
        new PlayController(game, null);
    }

    @Test
    public void testEmptyOrigin(){
        Coordinate firstCoordinate = new CoordinateBuilder().build();
        Coordinate secondCoordinate = new CoordinateBuilder().build();
        when(moveController.move(firstCoordinate, secondCoordinate)).thenReturn(Error.EMPTY_ORIGIN);

        assertThat(sut.move(firstCoordinate, secondCoordinate), is(nullValue()));
    }

    @Test(expected = AssertionError.class)
    public void givenSUTWhenAcceptWithNullVisitorThenShouldThrowAssertionError(){
        sut.accept(null);
    }

    @Test
    public void givenSUTWhenAcceptThenControllerVisitorShouldVisitSUT(){
        InteractorControllersVisitor visitor = mock(InteractorControllersVisitor.class);
        sut.accept(visitor);
        verify(visitor).visit(sut);
    }

}
