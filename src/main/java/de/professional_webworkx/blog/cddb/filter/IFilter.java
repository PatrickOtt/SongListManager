package de.professional_webworkx.blog.cddb.filter;

public interface IFilter<T> {

	public boolean accept(T filter);
}
