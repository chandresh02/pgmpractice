package com.xworkz.di.component;

public class Librarian {

	private char Gender;

	public Librarian() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	public void setGender(char gender) {
		System.out.println(" invoked setGender \t" + gender);
		Gender = gender;
	}
	
	public void issue(String bookName)
	{
		System.out.println(this.Gender + "\t issued \t" + bookName);
		System.out.println("invoke isssue() of librarian");
		System.out.println(Gender + " issued" + bookName);
	}

}
