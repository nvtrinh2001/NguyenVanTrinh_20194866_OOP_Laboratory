package hust.soict.globalict.aims.media;

public class Track implements Playable {

	private String title;
	private int length;

	public Track() {
	}

	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	@Override
	public boolean equals(Object obj) {
		Track track = (Track) obj;
		return (this.title.equals(track.getTitle()) && this.length == track.getLength());
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
