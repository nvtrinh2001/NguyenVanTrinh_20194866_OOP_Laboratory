package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	// class attributes
	public static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc() {
		super();
		nbDigitalVideoDiscs++;
		setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	} 
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	public void discToString() {

		System.out.printf("%d. DVD - %s - %s - %s - %d: %f\n", getId(), getTitle(), getCategory(), getDirector(),
				getLength(), getCost());

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
