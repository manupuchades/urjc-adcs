package usantatecla.draughts.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import usantatecla.draughts.models.Coordinate;
import usantatecla.draughts.models.Error;
import usantatecla.draughts.models.Game;
import usantatecla.draughts.models.State;

public class MoveControllerTest {

	@InjectMocks
	private MoveController moveController;

	@Spy
	private State state;

	@Spy
	private Game game;

	@Mock
	private Coordinate coordinate;

	@Before
	public void before() {
		initMocks(this);
	}

	@Test
	public void blockedGameTest() {
		when(this.game.isBlocked()).thenReturn(true);
		Error error = moveController.move(coordinate, coordinate);
		verify(this.state, times(1)).next();
		assertThat(error, is(Error.EMPTY_ORIGIN));
	}

}
