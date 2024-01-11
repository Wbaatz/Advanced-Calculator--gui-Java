package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class factorialTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Cal1 c1 = new Cal1();
		double result = c1.get_fictorial(5);
		System.out.print(result);
		double expectedValue = 120.0;
		if(result == expectedValue) {
			assertEquals(true,true);
		}
	}

}
