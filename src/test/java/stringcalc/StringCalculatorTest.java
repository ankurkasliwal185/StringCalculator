package stringcalc;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void initialize() {
        calculator = new StringCalculator();
    }

//     public static void main(String args[]) {
//       org.junit.runner.JUnitCore.main("stringcalc.StringCalculatorTest");
//     }
    
    @Test
    public void testEmptyString() {
	assertEquals(0, calculator.add(""));
    }
	
    @Test
    public void testOneNumber() {
	assertEquals(1, calculator.add("1"));
	assertEquals(calculator.add("5"), 5);
    }
  
    @Test
    public void testTwoNumbers(){
        assertEquals(3, calculator.add("1,2"));
    }
    @Test
    public void testThreeNumbers(){
    	assertEquals(6, calculator.add("1,2,3"));
    }
	
    @Test
    public void testNewLine(){
    	assertEquals(6, calculator.add("1\n2,3"));
    }
	
    @Test
    public void threeNumbersDelimitedAnywayShouldBeSummed() {
        assertEquals(calculator.add("1,2,3"), 6);
        assertEquals(calculator.add("5\n2\n3"), 10);
    }
	
    @Test
    public void negativeInputReturnsException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negative input!");
        calculator.add("-1");
        calculator.add("-5,10\n-15");
    }	
}
