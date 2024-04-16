
package com.libaray.book;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>{
	
	//Store book details in a library in hashing based data structure : HashSet
	//Book details : isbn(string), category(enum), price(double), authorName(string), quantity(int) .
	//Unique ID : isbn
	private String isbn;
	private double price;
	Category category;
	private String authorName;
	private int quantity;
	
	Scanner sc=new Scanner(System.in);
	
	  public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	
		public Book() {
			
		}
		public Book(String isbn, double price, Category category, String authorName, int quantity) {
			this.isbn = isbn;
			this.price = price;
			this.category = category;
			this.authorName = authorName;
			this.quantity = quantity;
		}
		public void Accept() {
			System.out.println("Enter a ISBN number :");
			isbn=sc.next();
			System.out.println("Enter Price of Book :");
			price=sc.nextDouble();
			System.out.println("Author Name of Book :");
			authorName=sc.next();
			System.out.println("Enter A quqntity of Book :");
			quantity=sc.nextInt();
			
			Category[] c1= Category.values();
			for(Category ele:c1) 
				System.out.println(ele.ordinal()+". "+ele.name());
			System.out.println("Enter category of Book :");
			int n=sc.nextInt();
			this.category= c1[n];
			}
		@Override
		public String toString() {
			return "book [isbn=" + isbn + ", price=" + price + ", category=" + category + ", authorName=" + authorName
					+ ", quantity=" + quantity + "]";
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(isbn);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(isbn, other.isbn);
		}
		@Override
		public int compareTo(Book o) {
			return this.isbn.compareTo(o.isbn);
		}
		
		
		}

