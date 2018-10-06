package utils;

import java.util.Scanner;

import data.Book;

public class DataReader {
	private Scanner sc = new Scanner(System.in);
	
	public void close() {
		sc.close();
	}
	
	public Book readAndCreateBook() {
		System.out.println("Tytu�:");
		String title = sc.nextLine();
		System.out.println("Author:");
		String author = sc.nextLine();
		System.out.println("Wydawnictwo:");
		String publisher = sc.nextLine();
		System.out.println("ISBN:");
		String isbn = sc.nextLine();
		System.out.println("Rok wydania:");
		int releaseDate = sc.nextInt(); 
		System.out.println("Ilo�� stron: ");
		int pages = sc.nextInt();
		sc.nextLine();
		
		return new Book(title, author, releaseDate, pages, publisher, isbn);
	}

}
