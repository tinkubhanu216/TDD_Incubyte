import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		StringCalculator calObj=new StringCalculator();
		assertEquals(0,calObj.add(""),0.0);
	}
	@Test
	public void test2() {
		StringCalculator calObj=new StringCalculator();
		assertEquals(2,calObj.add("1,1"),0.0);
	}
	@Test
	public void test3() {
		StringCalculator calObj=new StringCalculator();
		assertEquals(7,calObj.add("1,2,4"),0.0);
	}
}
