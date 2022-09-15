import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class individualTest {
	
	
	@Test
	void testRight() {
		assertEquals(-1, individual.right("left")); //checks if the method left is outputing the correct value (-1) when input "left".
	}

}
