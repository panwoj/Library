package app;

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControl {
	public final int exit = 0;
	public final int addBook = 1;
	public final int printBooks = 2;
	
	private Library library;
	private DataReader dataReader;

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}
	
	public void controlLoop() {
		int option;
		printOptions();
		while((option = dataReader.getInt()) != exit) {
			switch(option) {
			case addBook:
				addBook();
				break;
			case printBooks:
				printBooks();
				break;
			default:
				System.out.println("Nie ma takiej opcji. Wprowadz ponownie!");
			}
			printOptions();
		}
		System.out.println("Zamykam program!");
		dataReader.close();
	}
	
	private void printOptions() {
		System.out.println("Wybierz opcjê: ");
		System.out.println("0 - wyjœcie z programu");
		System.out.println("1 - dodanie nowej ksi¹¿ki");
		System.out.println("2 - wyœwietl dostêpne ksi¹¿ki");
	}
	
	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}
	
	private void printBooks() {
		System.out.println("Dostêpne ksi¹¿ki:");
		library.printBooks();
	}
}
