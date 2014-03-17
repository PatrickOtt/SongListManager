package de.professional_webworkx.blog.cddb.filter;

import de.professional_webworkx.blog.cddb.model.Song;

public class BetweenYearFilter<T extends Object & Comparable<T>> implements IFilter<T> {

	private final int lowBoundary;
	private final int highBoundary;
	
	public BetweenYearFilter(final int low, final int high) {
		this.lowBoundary 	= low;
		this.highBoundary	= high;
	}
	
	public boolean accept(T object) {
		Song song = (Song)object;
		return Integer.valueOf(song.getYear()).compareTo(Integer.valueOf(lowBoundary)) >= 0 && 
				Integer.valueOf(song.getYear()).compareTo(Integer.valueOf(highBoundary)) <= 0;
		
	}

}
