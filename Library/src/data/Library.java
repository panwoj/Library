package data;

import utils.DataReader;

public class Library {
	public final int maxBooks = 1000;
	private Book[] books;
	private int booksNumber;
	
	public Library() {
		books = new Book[maxBooks];
	}
	
	public int getBooksNumber() {
		return booksNumber;
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	public void addBook(Book book) {
		if(booksNumber < maxBooks) {
			books[booksNumber] = book;
			booksNumber++;
			System.out.println("Ksi��ka dodana!");
		} else {
			System.out.println("Maksymalna liczba ksi��ek zosta�a osi�gni�ta");
		}
	}
	
	public void printBooks() {
		if(booksNumber==0) {
			System.out.println("Brak ksi��ek w bibliotece.");
		} else {
			for(int i=0; i<booksNumber; i++) {
				books[i].printInfo();
			}
		}
	}
}
