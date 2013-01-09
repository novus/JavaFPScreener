package com.novus.fp;

import org.junit.Assert;
import org.junit.Test;

import com.novus.fp.F1;
import static com.novus.fp.Functions.*;

public class FunctionTest {
	
	/*
	 * Exercise 1: Implement these functions under test so that each test passes.
	 */
	
	@Test
	public void increment5I() {
		Integer i = increment5I.apply(5);
		Assert.assertEquals(10, i.intValue());
	}
	
	@Test
	public void squareI() {
		Integer i = squareI.apply(5);
		Assert.assertEquals(25, i.intValue());		
	}
	
	/*
	 * Exercise 2: Implement F1 composition (f . g) so that tests on the composed functions pass.
	 */
		
	@Test
	public void add5AndSquareComposition() {
		F1<Integer, Integer> plus5andSquare = increment5I.andThen(squareI);
		Integer x = plus5andSquare.apply(5);
		Assert.assertEquals(100, x.intValue());
	}
	
}
