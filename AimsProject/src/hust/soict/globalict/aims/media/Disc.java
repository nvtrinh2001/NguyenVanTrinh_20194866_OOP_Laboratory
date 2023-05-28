package hust.soict.globalict.aims.media;

public class Disc extends Media {
	
	private int length;
    private String director;
    
    public Disc(int id) {
        super(id);
    }
    
    public Disc(int id, String title) {
        super(id, title);
    }
    
    public Disc(int id, String title, String category) {
        super(id, title, category);
    }
    
    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public Disc(int id, String title, String category, float cost, String director) {
        super(id, title, category, cost);
        this.director = director;
    }
    
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
