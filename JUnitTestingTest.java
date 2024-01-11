package muz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestingTest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("muzamil");
		assertEquals(1, output);

	}

}
