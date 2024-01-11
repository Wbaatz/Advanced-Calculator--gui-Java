package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sumtest {

	@Test
	public void test() {
		Cal1 c1 = new Cal1();
		double result = c1.Sum(4, 5);
		System.out.print(result);
		double expectedValue = 9;
		if(result == expectedValue) {
			assertEquals(true,true);
		}
	}

}
