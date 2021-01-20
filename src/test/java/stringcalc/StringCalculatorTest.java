package stringcalc;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

    public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("stringcalc.StringCalculatorTest");
    }
    
    @Test
  	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	  }
}
