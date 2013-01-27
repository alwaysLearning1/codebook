package puzzlers.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import puzzlers.string.StringReversal;

public class StringReversalTest {

	@Test
	public void testReverse() {
		assertEquals("tset", StringReversal.reverseUsingLoop("test"));
		assertEquals("tset", StringReversal.reverseUsingXOR("test"));
		assertEquals("tset", StringReversal.reverseUsingTemp("test"));
		assertEquals("tset", StringReversal.reverseUsingRecursion("test"));
	}

	@Test
	public void testReverseOdd() {
		assertEquals("mordnilap", StringReversal.reverseUsingLoop("palindrom"));
		assertEquals("mordnilap", StringReversal.reverseUsingXOR("palindrom"));
		assertEquals("mordnilap", StringReversal.reverseUsingTemp("palindrom"));
		assertEquals("mordnilap", StringReversal.reverseUsingRecursion("palindrom"));
	}

	@Test
	public void testPalindrom() {
		assertEquals("madam", StringReversal.reverseUsingLoop("madam"));
		assertEquals("madam", StringReversal.reverseUsingXOR("madam"));
		assertEquals("madam", StringReversal.reverseUsingTemp("madam"));
		assertEquals("madam", StringReversal.reverseUsingRecursion("madam"));
	}

	@Test
	public void testReverseWords() {
		assertEquals("owt ro eno", StringReversal.reverseUsingLoop("one or two"));
		assertEquals("owt ro eno", StringReversal.reverseUsingXOR("one or two"));
		assertEquals("owt ro eno", StringReversal.reverseUsingTemp("one or two"));
		assertEquals("owt ro eno", StringReversal.reverseUsingRecursion("one or two"));
	}

	@Test
	public void testPalindrom1() {
		assertEquals("ababa", StringReversal.reverseUsingLoop("ababa"));
		assertEquals("ababa", StringReversal.reverseUsingXOR("ababa"));
		assertEquals("ababa", StringReversal.reverseUsingTemp("ababa"));
		assertEquals("ababa", StringReversal.reverseUsingRecursion("ababa"));
	}

	@Test
	public void testTime() {
		
		long startTime = System.nanoTime();	
		StringReversal.reverseUsingTemp("Pneumonoultramicroscopicsilicovolcanoconiosis");
		long endTime = System.nanoTime();
		long durationForTemp = endTime - startTime;
		System.out.println("Executing time for reverseUsingTemp: " + durationForTemp);

		long startTime1 = System.nanoTime();
		StringReversal.reverseUsingLoop("Pneumonoultramicroscopicsilicovolcanoconiosis");
		long endTime1 = System.nanoTime();
		long durationForLoop = endTime1 - startTime1;
		System.out.println("Executing time for reverseUsingLoop: " + durationForLoop);
		
		long startTime2 = System.nanoTime();
		StringReversal.reverseUsingXOR("Pneumonoultramicroscopicsilicovolcanoconiosis");
		long endTime2 = System.nanoTime();
		long durationForXOR = endTime2 - startTime2;
		System.out.println("Executing time for reverseUsingXOR: " + durationForXOR);

		long startTime3 = System.nanoTime();
		StringReversal.reverseUsingRecursion("Pneumonoultramicroscopicsilicovolcanoconiosis");
		long endTime3 = System.nanoTime();
		long durationForRecursion = endTime3 - startTime3;
		System.out.println("Executing time for reverseUsingRecursion : " + durationForRecursion);
	}
}
