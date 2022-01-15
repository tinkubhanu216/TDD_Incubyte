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
		assertEquals(6,calObj.add("1\\n2,3"),0.0);
	}
	@Test
	public void test3() {
		StringCalculator calObj=new StringCalculator();
		assertEquals(3,calObj.add("//;\\n1;2"),0.0);
	}
}
