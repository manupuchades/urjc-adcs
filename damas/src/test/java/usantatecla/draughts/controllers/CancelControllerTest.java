package usantatecla.draughts.controllers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import usantatecla.draughts.models.Game;
import usantatecla.draughts.models.State;

public class CancelControllerTest {

	@InjectMocks
	CancelController cancelController;

	@Spy
	protected Game game;

	@Spy
	protected State state;

	@Before
	public void before() {
		initMocks(this);
	}

	@Test
	public void Cancel() {
		cancelController.cancel();
		verify(this.game, times(1)).cancel();
		verify(this.state, times(1)).next();
	}

}
