package _04_Searching_With_Streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StreamSearchTest {
	@Test
	void test1() {
		String[] strArr = {
			"one", "two", "two",
			"three", "three", "three",
			"four", "four", "four", "four"
		};
		StreamSearcher ss = new StreamSearcher();
		assertEquals(1, ss.containsCount(strArr, "one"));
		assertEquals(2, ss.containsCount(strArr, "two"));
		assertEquals(3, ss.containsCount(strArr, "three"));
		assertEquals(4, ss.containsCount(strArr, "four"));
	}
}
