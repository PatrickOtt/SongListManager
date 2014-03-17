package de.professional_webworkx.blog.cddb.model;

import java.util.StringTokenizer;

public class Song implements Comparable<Song>{
	
	private int year;
	private int rank;
	private String artist;
	private String title;

	public Song(final int year, final int rank, final String title, final String artist) {
		this.year	= year;
		this.rank	= rank;
		this.title	= title;
		this.artist	= artist;
	}
	
	public Song(String s){
		StringTokenizer stringTokenizer = new StringTokenizer(s, "\t");
		String strYear = stringTokenizer.nextToken();
		year = Integer.parseInt(strYear);
		String strRank = stringTokenizer.nextToken();
		rank = Integer.parseInt(strRank);
		title = stringTokenizer.nextToken();
		artist = stringTokenizer.nextToken();

	}

	public int getYear(){
		return year;
	}

	public int getRank(){
		return rank;
	}

	public String getArtist(){
		return artist;
	}

	public String getTitle(){
		return title;
	}

	public String toString(){
		return String.format(year + "\t" + rank + "\t" + artist + "\t" + title);

	}

	public int compareTo(Song o) {
		if(this.getYear() < o.getYear()) 
			return -1;
		if(this.getYear() > o.getYear()) 
			return 1;
		return 0;
	}
}