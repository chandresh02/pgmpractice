package com.xworkz.di.tester;

import com.xworkz.di.component.Librarian;
import com.xworkz.di.component.Library;

public class OldJavaStyleTester {
	public static void main(String[] args) {

		Librarian librarian = new Librarian();
		librarian.setGender('M');

		Library library = new Library(librarian);

		library.setName("central library");

		library.issueBook("head first");

	}

}
