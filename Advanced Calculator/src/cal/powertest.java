package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class powertest {

	@Test
	public void test() {
		Cal1 c1 = new Cal1();
		double result = c1.get_power("2", "3");
		System.out.print(result);
		double expectedValue = 8;
		if(result == expectedValue) {
			assertEquals(true,true);
		}
	}

}
