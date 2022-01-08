package project;

public class Venue {

	private String venueName;
	private int capacity;
	private String location;
	
	
	public Venue(String venueName, int capacity, String location) {
		this.venueName = venueName;
		this.capacity = capacity;
		this.location = location;
	}


	public String getVenueName() {
		return venueName;
	}


	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
