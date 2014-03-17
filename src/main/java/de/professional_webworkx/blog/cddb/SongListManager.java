package de.professional_webworkx.blog.cddb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import de.professional_webworkx.blog.cddb.filter.BetweenFilter;
import de.professional_webworkx.blog.cddb.filter.BetweenYearFilter;
import de.professional_webworkx.blog.cddb.filter.FilterUtils;
import de.professional_webworkx.blog.cddb.filter.IFilter;
import de.professional_webworkx.blog.cddb.model.Song;

public class SongListManager {
	public static void main(String[] args){
		SongCollection<Song> collection = new SongCollection<Song>();
		try {
			
			
				Scanner input = new Scanner(new File("data/agazillionsongs.txt"));
				String line = "";
				while(input.hasNextLine()) {
					String user = input.nextLine();

					collection.add(new Song(user));
				}
			
			for(Song song : collection) {
				System.out.println(song);
			}
			
			System.out.println("Filtered by Artist");
			List<Song> filteredByArtist = collection.sortByArtist();
			for(Song song : filteredByArtist) {
				System.out.println(song);
			}
			IFilter<Song> betweenFilter = new BetweenFilter<Song>(new Song(1999, 1, "Hyper Hyper", "Scooter"), new Song(2001, 23, "Title", "DemoArtist"));
			List<Song> applyFilter = FilterUtils.applyFilter(filteredByArtist, betweenFilter);
			
			System.out.println("With applied Filter");
			for(Song val : applyFilter) 
				System.out.println(val);

			IFilter<Song> betweenYears	= new BetweenYearFilter<Song>(2010, 2013);
			List<Song> betweenYearsFiltered = FilterUtils.applyFilter(collection, betweenYears);
			
			System.out.println("With applied years filter");
			for(Song song : betweenYearsFiltered) {
				System.out.println(song);
			}
			
		} catch (FileNotFoundException e) { 
			System.out.println("File not found"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}