package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	private int id;
	private String title;
	private String category;
	private float cost; 

	public Media() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		Media media = (Media) obj;
		return (this.title.equals(media.getTitle()));
	}
	
	@Override
	public String toString() {
		String result = title + "   " + category + "   " + cost;
		return result;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
