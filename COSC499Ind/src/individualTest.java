import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class individualTest {
	
	
	@Test
	void testRight() {
		assertEquals(1, individual.right("right")); //checks if the method right is outputing the correct value (1) when input "right".
	}
	
	void testLeft() {
		assertEquals(-1, individual.left("left")); //checks if the method left is outputing the correct value (-1) when input "left".
	}

}
