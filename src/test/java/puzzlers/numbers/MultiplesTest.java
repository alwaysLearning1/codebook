package puzzlers.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplesTest {

	@Test
	public void testCalculateForZero() {
		assertEquals(0, Multiples.calculate(0));
	}
	
	@Test
	public void testCalculateForOne() {
		assertEquals(0, Multiples.calculate(1));
	}
	
	@Test
	public void testCalculateForThree() {
		assertEquals(0, Multiples.calculate(3));
	}
	
	@Test
	public void testCalculateForFive() {
		assertEquals(0, Multiples.calculate(5));
	}
	
	@Test
	public void testCalculateForFifteen() {
		assertEquals(0, Multiples.calculate(15));
	}
	@Test
	public void testCalculateForSixteen() {
		assertEquals(15, Multiples.calculate(16));
	}
		
	@Test
	public void testCalculateFor45() {
		assertEquals(45, Multiples.calculate(45));
	}
	
	@Test
	public void testCalculateFor50() {
		assertEquals(90, Multiples.calculate(50));
	}
	
	@Test
	public void testCalculateFor51() {
		assertEquals(90, Multiples.calculate(51));
	}
	@Test
	public void testCalculateFor61() {
		assertEquals(150, Multiples.calculate(61));
	}
	@Test
	public void testCalculateForOneFifty() {
		assertEquals(675, Multiples.calculate(150));
	}
	@Test
	public void testCalculateForOneFiftyOne() {
		assertEquals(825, Multiples.calculate(151));
	}
	@Test
	public void testCalculateForNegative() {
		assertEquals(0, Multiples.calculate(-3));
	}
}
