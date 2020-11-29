package usantatecla.draughts.views;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import usantatecla.draughts.controllers.StartController;

public class StartViewTest {

    @InjectMocks
    private StartView sut;

    @Before
    public void before(){
        initMocks(this);
    }

    @Test(expected = AssertionError.class)
    public void givenSUTWhenInteractWithNullControllerThenShouldThrowAssertionError(){
        sut.interact(null);
    }

}
