package videoinventory;

public class Video {

	String videoName;
	boolean checkout;
	int rating;
	public Video() {
		// TODO Auto-generated constructor stub
	}
	
	Video(String name){
		this.videoName=name;
	}
	
	String getName() {
		return videoName;
	}
	
	void doCheckout() {
		checkout=true;
	}
	
	void doReturn() {
		checkout=false;
	}
	
	void receiveRating(int r) {
		this.rating=r;
	}
	
	int getRating() {
		return rating;
	}
	
	boolean getCheckout() {
		return checkout;
	}

}
