package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;

	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {

		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}

		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");

	}
	
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		
//		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//			System.out.println("The cart is almost full");
//			return;
//		}
//		
//		for (DigitalVideoDisc disc : dvdList) {
//			itemsOrdered[qtyOrdered] = disc;
//			qtyOrdered++;
//		}
//		
//		System.out.println("The disc list has been added");
//		
//	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		
		for (DigitalVideoDisc disc : dvdList) {
			addDigitalVideoDisc(disc);
		}
		
		System.out.println("The disc list has been added");
		
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
		
		System.out.println("Both DVDs have been added");
		
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {

		if (qtyOrdered == 0) {
			System.out.println("Cart is empty");
			return;
		}

		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered--;
				itemsOrdered[qtyOrdered] = null;
				System.out.println("The disc has been removed");
				return;
			}
		}
		System.out.println("The disc is not found");

	}

	public float totalCost() {

		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;

	}
	
	public void print() {
		
		System.out.println("********************CART*******************");
		for (int i = 0; i < qtyOrdered; i++) {
			itemsOrdered[i].discToString();
		}
		System.out.printf("Total cost: %f\n", totalCost());
		System.out.println("*******************************************");
	}
	
	public DigitalVideoDisc search(int id) {
		
		for (int i = 0; i < qtyOrdered; i++) {
			boolean isMatch = itemsOrdered[i].isMatch(id);
			if (isMatch)
				return itemsOrdered[i];
		}
		throw new java.lang.RuntimeException("ID not found.");
		
	}
	
public DigitalVideoDisc search(String title) {
		
		for (int i = 0; i < qtyOrdered; i++) {
			boolean isMatch = itemsOrdered[i].isMatch(title);
			if (isMatch)
				return itemsOrdered[i];
		}
		throw new java.lang.RuntimeException("Title not found.");
		
	}
	
}
