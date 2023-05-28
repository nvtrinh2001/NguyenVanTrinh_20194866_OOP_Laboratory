package hust.soict.globalict.aims.media;

import java.util.*;

public class CompactDisc extends Disc {
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(int id) {
        super(id);
	}
	
	public CompactDisc(int id, String title) {
        super(id, title);
	}
	
	public CompactDisc(int id, String title, String category) {
        super(id, title, category);
	}
	
	public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
	}
	
	public CompactDisc(int id, String title, String category, float cost, String director) {
        super(id, title, category, cost, director);
	}

	public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
	}
	
	public CompactDisc(int id, String title, String category, float cost, String director, String artist,
			List<Track> tracks) {
		super(id, title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void addTrack(Track track) {
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).getTitle().equals(track.getTitle())) {
				System.out.println("Track already exists!");
				return;
			}
		}
		
		tracks.add(track);
		System.out.println("Track added successfully!");
		return;
	}
	
	public void removeTrack(Track track) {
		for (int i = 0; i < tracks.size(); i++) {
			if (!tracks.get(i).getTitle().equals(track.getTitle())) {
				System.out.println("Track doesn't exist!");
				return;
			}
		}
		
		tracks.remove(track);
		System.out.println("Track removed successfully!");
		return;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

}
