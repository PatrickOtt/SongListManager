package de.professional_webworkx.blog.cddb.filter;

public class BetweenFilter<T extends Object & Comparable<T>> implements IFilter<T> {

	private T lowBoundary;
	private T highBoundary;
	
	public BetweenFilter(final T lowBoundary, final T highBoundary) {
		this.lowBoundary	= lowBoundary;
		this.highBoundary	= highBoundary;
	}
	
	public boolean accept(T object) {
		return lowBoundary.compareTo(object) <= 0 &&
				highBoundary.compareTo(object) >= 0;
	}

}
