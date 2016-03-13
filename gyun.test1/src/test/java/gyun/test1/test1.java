package gyun.test1;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gyoonh
 *
 */
public class test1 {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		test1Method01 t1m1 = new test1Method01();
		assertEquals(2, t1m1.getNumber());
	}

}
