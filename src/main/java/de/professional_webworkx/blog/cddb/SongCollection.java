package de.professional_webworkx.blog.cddb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.professional_webworkx.blog.cddb.comparators.ArtistComparator;
import de.professional_webworkx.blog.cddb.comparators.YearComparator;
import de.professional_webworkx.blog.cddb.model.Song;

public class SongCollection<T> extends ArrayList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7754560588028902292L;

	public SongCollection() {
		
	}
	
	public void addSong(final T song) {
		this.add(song);
	}
	
	public T getSong(final int idx) {
		return this.get(idx);
	}
	
	public List<T> sortByArtist() {
		Collections.sort((List<Song>)this, new ArtistComparator());
		return this;
	}
	
	public List<T> sortByYear() {
		Collections.sort((List<Song>)this, new YearComparator());
		return this;
	}
	
}
