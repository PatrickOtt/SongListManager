package de.professional_webworkx.blog.cddb.comparators;

import java.util.Comparator;

import de.professional_webworkx.blog.cddb.model.Song;

/**
 * YearComparator
 * @author ottp
 *
 */
public class YearComparator implements Comparator<Song> {

	public int compare(Song o1, Song o2) {
		if(o1.getYear() < o2.getYear()) 
			return -1;
		if(o1.getYear() > o2.getYear()) 
			return 1;
		
		return 0;
	}

}
