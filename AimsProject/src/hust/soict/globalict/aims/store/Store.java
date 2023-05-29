package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.Media;
import java.util.*;

public class Store {

	public static final int MAX_NUMBERS_ORDERED = 100;

	private List<Media> itemsInStore = new ArrayList<Media>();
	
	public int getNumberInStore() {
		return itemsInStore.size();
	}

	public void addMedia(Media media) {

		if (itemsInStore.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The store is full");
			return;
		}

		itemsInStore.add(media);
		System.out.println("New Media added to store");

	}

	public void removeMedia(Media media) {

		if (itemsInStore.size() == 0) {
			System.out.println("Store is empty");
			return;
		}

		itemsInStore.remove(media);
		System.out.println("The media has been removed from Store.");

	}
	
	public void print() {
		System.out.println("=============STORE=============");
		if (getNumberInStore() == 0) {
			System.out.println("Store is empty!");
		}
		for(Media item: itemsInStore) System.out.println(item.toString());
		System.out.println("===============================");
	}
	
	public Media search(int id) {
		
		if (id < 0 || id > getNumberInStore()) {
			System.out.println("ID not found.");
			return null;
		}

		return itemsInStore.get(id);

	}

	public Media search(String title) {

		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title))
				return media;
		}
		
		System.out.println("Title not found.");
		return null;

	}

}
