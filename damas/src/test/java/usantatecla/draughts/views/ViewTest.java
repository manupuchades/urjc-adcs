package usantatecla.draughts.views;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import usantatecla.draughts.controllers.InteractorController;
import usantatecla.draughts.controllers.PlayController;
import usantatecla.draughts.controllers.ResumeController;
import usantatecla.draughts.controllers.StartController;
import usantatecla.draughts.models.Game;
import usantatecla.draughts.models.State;

public class ViewTest {

	@InjectMocks
	private View view;
	@Mock
	private StartView startView;
	@Mock
	private PlayView playView;
	@Mock
	private ResumeView resumeView;

	InteractorController controller;

	@Before
	public void init() {
		initMocks(this);
	}

	@Test
	public void interactWithStartView() {
		StartController startController = new StartController(new Game(), new State());
		controller = startController;
		this.view.interact(controller);
		verify(this.startView, times(1)).interact(startController);
	}

	@Test
	public void interactWithPlayView() {
		PlayController playController = new PlayController(new Game(), new State());
		controller = playController;
		this.view.interact(controller);
		verify(this.playView, times(1)).interact(playController);
	}

	@Test
	public void interactWithResumeView() {
		ResumeController resumeController = new ResumeController(new Game(), new State());
		controller = resumeController;
		this.view.interact(controller);
		verify(this.resumeView, times(1)).interact(resumeController);
	}

}
