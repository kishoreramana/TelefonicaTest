/**
 * 
 */
package test.java;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.NamingNumbers;

/**
 * @author 497765
 *
 */
public class NumbersTest {

	private NamingNumbers namingNumbers;	
	
	private static int INPUT_FIZZ = 3;
	private static int INPUT_BIZZ = 5;
	private static int INPUT_FIZZ_BIZZ = 25;
	
	private static String EXPECTED_OUTPUT_FIZZ = "fizz";
	private static String EXPECTED_OUTPUT_BIZZ = "bizz";
	private static String EXPECTED_OUTPUT_FIZZ_BIZZ = "fizzbizz";
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		namingNumbers = new NamingNumbers();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		namingNumbers = null;
	}

	@Test
	public void testNumberFizz() {
		assertEquals(EXPECTED_OUTPUT_FIZZ, namingNumbers.getNumberName(INPUT_FIZZ));
	}
	
	@Test
	public void testNumberBizz() {
		assertEquals(EXPECTED_OUTPUT_BIZZ, namingNumbers.getNumberName(INPUT_BIZZ));
	}
	
	@Test
	public void testNumber1FizzBizz() {
		assertEquals(EXPECTED_OUTPUT_BIZZ, namingNumbers.getNumberName(INPUT_FIZZ_BIZZ));
	}

}
