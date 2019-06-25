package com.xworkz.di.component;

public class Library {
	private String Name;

	private Librarian librarian;

	public Library(Librarian librarian) {
		System.out.println(" created \t" + this.getClass().getSimpleName());
		this.librarian = librarian;

	}

	public void setName(String name) {
		System.out.println("invoke setName \t" + name);
		Name = name;
	}

	public void issueBook(String bookName) {
		System.out.println(" issued \t" + bookName);
		if (librarian != null) {
			librarian.issue("Head Fisrt");
			System.out.println(" issue \t" + bookName + "\t from " + this.Name);

		} else {
			System.out.println("librarian is not available can't issue book");
		}

	}

}
