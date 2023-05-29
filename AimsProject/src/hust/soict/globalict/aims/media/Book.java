package hust.soict.globalict.aims.media;

import java.util.*;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();

	public Book() {
		super();
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName.toLowerCase())) {
			System.out.println("Author already exists!");
			return;
		}

		authors.add(authorName.toLowerCase());
		System.out.printf("Author %s added successfully.\n", authorName);
		return;
	}

	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName.toLowerCase())) {
			System.out.println("Author doesn't exist!");
			return;
		}

		authors.remove(authorName.toLowerCase());
		System.out.printf("Author %s added successfully.\n", authorName);
		return;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

}
