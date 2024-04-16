package com.libaray.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class librarybook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Book> BookList = new HashSet<>();
		Book b;

		class SortByCategory implements Comparator<Book> {
			@Override
			public int compare(Book o1, Book o2) {
				return o2.getCategory().compareTo(o1.getCategory());
			}
		}

		class ComparatorByAuthor implements Comparator<Book> {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getAuthorName().compareTo(o2.getAuthorName());
			}

		}
		int n = 0;
		do {
			menu[] m = menu.values();
			for (menu ele : m)
				System.out.println(ele.ordinal() + ". " + ele.name());
			System.out.println("Enter a choice :");
			n = sc.nextInt();
			switch (n) {
			case 0:
				System.out.println("Thank You!!!");
				break;
			case 1: {
				b = new Book();
				b.Accept();
				BookList.add(b);
			}
				break;
			case 2: {
				for (Book ele : BookList)
					System.out.println(ele);
			}
				break;
			case 3: {
				ArrayList<Book> ABook = new ArrayList<>();
				ABook.addAll(BookList);
				Comparator<Book> bookcat = new SortByCategory();
				Collections.sort(ABook, bookcat);
				for (Book ele : ABook)
					System.out.println(ele);
			}
				break;
			case 4: {
				ArrayList<Book> ABook = new ArrayList<>();
				ABook.addAll(BookList);
				Comparator<Book> comByAuthor = new ComparatorByAuthor();
				Collections.sort(ABook, comByAuthor);
				for (Book ele : ABook)
					System.out.println(ele);
			}
				break;
			case 5: {
				Book tempbook = new Book();
				String bokid;
				System.out.println("Enter a book id You want to Search :");
				bokid = sc.next();
				tempbook.setIsbn(bokid);
				ArrayList<Book> ABook = new ArrayList<>();
				ABook.addAll(BookList);
				//System.out.println(BookList.contains(tempbook));
				if (ABook.contains(tempbook)) {
					System.out.println(ABook.get(ABook.contains(tempbook)));
				} else {
					System.out.println("Book is not in library");
				}
			}
			break;
			default:
				break;
			}
		} while (n != 0);
	}
}
