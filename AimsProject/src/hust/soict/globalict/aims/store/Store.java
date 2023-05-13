package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
	
	public static final int MAX_NUMBERS_ORDERED = 100;
	
	public int numberInStore = 0;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int getNumberInStore() {
		
		return this.numberInStore;
		
	}
	
	public void addDVD(DigitalVideoDisc dvd) {
		
		if (numberInStore == MAX_NUMBERS_ORDERED) {
			System.out.println("The store is full");
			return;
		}
		
		itemsInStore[numberInStore] = dvd;
		numberInStore++;
		System.out.println("New DVD added to store");
		
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		
		if (numberInStore == 0) {
			System.out.println("Store is empty");
			return;
		}
		
		for (int i = 0; i < numberInStore; i++) {
			if (itemsInStore[i].equals(disc)) {
				for (int j = i; j < numberInStore - 1; j++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				numberInStore--;
				itemsInStore[numberInStore] = null;
				System.out.println("The disc has been removed from Store.");
				return;
			}
		}
		
	}
	
}
