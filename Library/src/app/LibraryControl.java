package app;

import data.Book;
import data.Library;
import utils.DataReader;
import data.Magazine;

public class LibraryControl {
	public static final int EXIT = 0;
	public static final int ADD_BOOK = 1;
	public static final int ADD_MAGAZINE = 2;
	public static final int PRINT_BOOKS = 3;
	public static final int PRINT_MAGAZINES = 4;
	
	private Library library;
	private DataReader dataReader;

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}
	
	public void controlLoop() {
		int option;
		printOptions();
		while((option = dataReader.getInt()) != EXIT) {
			switch(option) {
			case ADD_BOOK:
				addBook();
				break;
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case PRINT_BOOKS:
				printBooks();
				break;
			case PRINT_MAGAZINES:
				printMagazines();
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
		System.out.println("Wybierz opcj�: ");
		System.out.println(EXIT + " - wyj�cie z programu");
		System.out.println(ADD_BOOK + " - dodanie nowej ksi��ki");
		System.out.println(ADD_MAGAZINE + " - dodanie nowego magazynu");
		System.out.println(PRINT_BOOKS + " - wy�wietl dost�pne ksi��ki");
		System.out.println(PRINT_MAGAZINES + " - wy�wietl dost�pne magazyny");
	}

	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void printBooks() {
		library.printBooks();
	}
	
	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	private void printMagazines() {
		library.printMagazines();
	}
}
