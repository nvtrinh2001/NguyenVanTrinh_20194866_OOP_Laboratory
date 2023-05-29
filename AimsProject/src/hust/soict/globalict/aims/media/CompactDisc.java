package hust.soict.globalict.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable {

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		super();
	}
	
	public void play() {
		System.out.println("Artist: " + getArtist());
		System.out.println("Number of tracks: " + tracks.size());
		for (Track track : tracks) {
			track.play();
		}
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

	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
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
