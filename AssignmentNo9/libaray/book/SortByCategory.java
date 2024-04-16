package com.libaray.book;

import java.util.Comparator;

public class SortByCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getCategory().compareTo(o2.getCategory());
	}

}
