package hust.soict.globalict.aims.cart;

import java.util.*;
import hust.soict.globalict.aims.media.Media;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 
	
	public int getSize() {
		return itemsOrdered.size();
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	public void addMedia(Media media) {

		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}

		itemsOrdered.add(media);
		System.out.println("The media has been added");

	}

	public void addMedia(Media... mediaList) {

		for (Media media : mediaList) {
			addMedia(media);
		}

		System.out.println("The media list has been added");

	}

	public void addMedia(Media media1, Media media2) {

		addMedia(media1);
		addMedia(media2);

		System.out.println("Both have been added");

	}

	public void removeMedia(Media media) {

		if (itemsOrdered.size() == 0) {
			System.out.println("Cart is empty");
			return;
		}

		itemsOrdered.remove(media);
		System.out.println("The media is removed");

	}
	
	public float totalCost() {

		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;

	}

	public void print() {

		System.out.println("=============CART=============");
		if (getSize() == 0) {
			System.out.println("Cart is empty!");
		}
			
		for (Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
		
		System.out.printf("Total cost: %f\n", totalCost());
		System.out.println("==============================");
	}
	
	public Media search(int id) {
		
		if (id < 0 || id > getSize()) {
			System.out.println("ID not found.");
			return null;
		}

		return itemsOrdered.get(id);

	}

	public Media search(String title) {

		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title))
				return media;
		}
		
		System.out.println("Title not found.");
		return null;

	}
	
	public void deleteAll() {
		itemsOrdered = new ArrayList<Media>();
	}

}
