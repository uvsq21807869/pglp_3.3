package uvsq.fr.pgpl_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {
	@Test
	public void tourneTest() {
		Position pos=new Position(3,3);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Direction expected=Direction.EST;
		R.tourne();
		assertEquals(expected,R.getDirection());
	}
	


}
