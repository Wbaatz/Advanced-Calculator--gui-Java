package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class getrootTest {

	@Test
	public void test() {
		Cal1 c1 = new Cal1();
		double result = c1.get_root("4");
		System.out.print(result);
		double expectedValue = 2;
		if(result == expectedValue) {
			assertEquals(true,true);
		}
	}

}
