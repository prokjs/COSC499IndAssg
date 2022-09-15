import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class individualTest {
	
	
	@Test
	void testLeft() {
		assertEquals(-1, individual.left("left")); //checks if the method left is outputing the correct value (-1) when input "left".
	}

}
