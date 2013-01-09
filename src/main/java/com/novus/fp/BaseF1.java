package com.novus.fp;

/**
 * A base implementation of a 1-argument function.
 */
public abstract class BaseF1<A, B> implements F1<A, B> {
	
	public <C> F1<A, C> andThen(final F1<B, C> g) {
		throw new RuntimeException("TODO implement composition");
	}
}
