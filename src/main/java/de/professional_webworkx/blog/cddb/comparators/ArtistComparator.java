package de.professional_webworkx.blog.cddb.comparators;

import java.util.Comparator;

import de.professional_webworkx.blog.cddb.model.Song;

public class ArtistComparator implements Comparator<Song> {

	public int compare(Song o1, Song o2) {
		
		int ret = o1.getArtist().compareTo(o2.getArtist());
		
		if(ret > 1) {
			return 1;
		}
		if(ret < 1) {
			return -1;
		}
		return 0;
	}

}
