package gyun.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaculatorTest {

	@Test
	public void evaluatesExpression() {
		Calculator caculator = new Calculator();
		int sum = caculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}

}
