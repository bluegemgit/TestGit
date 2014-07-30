package test.util;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class MathTest {

	@Test
	public void testDiv() {
		TestCase.assertEquals(new test.util.Math().div(10,2), 1,4);
	}

}
