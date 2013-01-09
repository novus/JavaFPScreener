package com.novus.fp;

/**
 * A representation of a 1-argument function. A pure function is merely a transformation
 * from some value of type A to a value of type B.
 */
public interface F1<A, B> {
	/** Apply this function to an input. */
	public B apply(A a);
	
	/** Compose this function with another, B => C, to yield a new function A => C. */
	public <C> F1<A, C> andThen(F1<B, C> g);
}
