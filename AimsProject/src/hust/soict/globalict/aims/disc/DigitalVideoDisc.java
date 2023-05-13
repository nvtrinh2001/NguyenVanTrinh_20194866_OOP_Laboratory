package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
	
	// class attributes
	public static int nbDigitalVideoDiscs = 0;
	
	// instance attributes
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;

	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void discToString() {
		
		System.out.printf("%d. DVD - %s - %s - %s - %d: %f\n", 
			getId(), getTitle(), getCategory(), getDirector(), getLength(), getCost()
		);
		
	}
	
	public boolean isMatch(int id) {
		
		if (this.getId() == id)
			return true;
		return false;
				
	}
	
	public boolean isMatch(String title) {
		
		if (this.getTitle().equals(title))
			return true;
		return false;
				
	}

}
