package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc {
	
	// class attributes
	public static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc() {
		super(++nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title) {
		super(++nbDigitalVideoDiscs, title);
	}
	
	public DigitalVideoDisc(String title, String category) {
		super(++nbDigitalVideoDiscs, title, category);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(++nbDigitalVideoDiscs, title, category, cost);
	}
	
	public DigitalVideoDisc(String title, String category, float cost, String director) {
		super(++nbDigitalVideoDiscs, title, category, cost, director);
	}
	
	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(++nbDigitalVideoDiscs, title, category, cost, length, director);
	}
	
	public void discToString() {
		
		System.out.printf("%d. DVD - %s - %s - %s - %d: %f\n", 
			getId(), getTitle(), getCategory(), getDirector(), getLength(), getCost()
		);
		
	}
	
	public boolean isMatch(int id) {
		
		if (getId() == id)
			return true;
		return false;
				
	}
	
	public boolean isMatch(String title) {
		
		if (getTitle().equals(title))
			return true;
		return false;
				
	}

}
