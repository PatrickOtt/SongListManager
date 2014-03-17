package de.professional_webworkx.blog.cddb.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {

	public static <T> List<T> applyFilter(final List<T> list, final IFilter<T> filter) {
		
		final List<T> filteredList = new ArrayList<T>();
		for(final T val : list) {
			if(filter.accept(val)) {
				filteredList.add(val);
			}
		}
		
		return filteredList;
				
	}
}
