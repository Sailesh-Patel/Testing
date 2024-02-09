package testExercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercise.DoggoComp;

public class TestDoggo {

	private DoggoComp doggoComp = new DoggoComp();

	@Test
	void testSize() {
		assertEquals(99, this.doggoComp.compete(42).size());
	}

	@Test
	void testContains() {
		assertEquals(false, this.doggoComp.compete(42).contains("42nd"));
	}

	@Test
	void testFirst() {
		assertEquals(true, this.doggoComp.compete(42).contains("21st"));
	}

	@Test
	void testSecond() {
		assertEquals(true, this.doggoComp.compete(42).contains("22nd"));
	}

	@Test
	void testThird() {
		assertEquals(true, this.doggoComp.compete(42).contains("23rd"));
	}

	@Test
	void testEleven() {
		assertEquals(true, this.doggoComp.compete(42).contains("11th"));
	}

	@Test
	void testTwelve() {
		assertEquals(true, this.doggoComp.compete(42).contains("12th"));
	}

	@Test
	void testThirteen() {
		assertEquals(true, this.doggoComp.compete(42).contains("13th"));
	}
}
