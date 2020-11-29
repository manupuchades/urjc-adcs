package usantatecla.draughts.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TurnTest {

	Turn turn;
	
	@Before
    public void before() {
        this.turn = new Turn();
    }
	
	@Test
	public void testDefaultPiece() {
		assertEquals(Color.WHITE, turn.getColor());
	}
	
	@Test
	public void testChangeColor() {
		turn.change();
		assertEquals(Color.BLACK, turn.getColor());
		
		turn.change();
		assertEquals(Color.WHITE, turn.getColor());
	}

}
