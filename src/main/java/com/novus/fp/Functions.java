package com.novus.fp;

/**
 * A utility class to house functions under test.
 */
public final class Functions {
	
	private Functions() {}
	
	/**
	 * A function for incrementing an integer value by 5.
	 * ex: increment5I(5) // returns 10
	 */
	public static final F1<Integer, Integer> increment5I = new BaseF1<Integer,Integer>() {
		public Integer apply(Integer i) {
			return i + 5;
		}
	};
	
	/** 
	 * The integer squaring function.
	 * ex: squareI(5) // returns 25
	 */
	public static final F1<Integer, Integer> squareI = new BaseF1<Integer,Integer>() {
		public Integer apply(Integer i) {
			return i * i;
		}
	};
	
}
