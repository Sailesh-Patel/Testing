package testExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import exercise.ReverseFactorial;

public class TestReverseFactorial {

	private ReverseFactorial reverseFactorial = new ReverseFactorial();

	@Test
	void test120() {
		Assertions.assertEquals("5!", this.reverseFactorial.reverse(120));
	}

	@Test
	void test150() {
		Assertions.assertEquals("NONE", this.reverseFactorial.reverse(150));
	}

	@Test
	void test1() {
		Assertions.assertEquals("1!", this.reverseFactorial.reverse(1));
	}

	@Test
	void test2() {
		Assertions.assertEquals("2!", this.reverseFactorial.reverse(2));
	}

	@Test
	void test3() {
		Assertions.assertEquals("3!", this.reverseFactorial.reverse(6));
	}
}
