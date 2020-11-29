package usantatecla.draughts.controllers;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import usantatecla.draughts.models.State;
import usantatecla.draughts.models.StateValue;

public class LogicTest {

	@InjectMocks
	private Logic logic;

	@Spy
	private State state;

	@Before
	public void before() {
		initMocks(this);
	}

	@Test
	public void startControllerCalledFirst() {
		assertThat(logic.getController(), instanceOf(StartController.class));
	}
	
	@Test
	public void startGame() {
		// FIXME
		when(state.getValueState()).thenReturn(StateValue.INITIAL);
		assertThat(logic.getController(), instanceOf(StartController.class));
	}
	
	@Test
	public void inGame() {
		doReturn(StateValue.IN_GAME).when(state).getValueState();
		assertThat(logic.getController(), instanceOf(PlayController.class));
	}
	
	@Test
	public void resumeGame() {
		doReturn(StateValue.FINAL).when(state).getValueState();
		assertThat(logic.getController(), instanceOf(ResumeController.class));
	}
	
	@Test
	public void exitGame() {
		doReturn(StateValue.EXIT).when(state).getValueState();
		assertThat(logic.getController(), nullValue());
	}

}
