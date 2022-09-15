import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class individualTest {
	
	
	@Test
	void testRight() {
		assertEquals(1, individual.right("right")); //checks if the method right is outputing the correct value (1) when input "right".
	}

}
