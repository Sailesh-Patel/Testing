package TestCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Calc.CalcBuild;

public class TestCalcBuild {

	private CalcBuild calc = new CalcBuild();

	@Test
	void testAdd() {
		Assertions.assertEquals(8, this.calc.add(4, 4));
	}

	@Test
	void testAddFail() {
		Assertions.assertEquals(5, this.calc.add(4, 4));
	}

	@Test
	void testAddDouble() {
		Assertions.assertEquals(8.2, this.calc.addDouble(4.1, 4.1));
	}

	@Test
	void testMinus() {
		Assertions.assertEquals(0, this.calc.minus(4, 4));
	}

	@Test
	void testmultiply() {
		Assertions.assertEquals(16, this.calc.multiply(4, 4));
	}

	@Test
	void testdivide() {
		Assertions.assertEquals(2, this.calc.divide(4, 2));
	}

}
