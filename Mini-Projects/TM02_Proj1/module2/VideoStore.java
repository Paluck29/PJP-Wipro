package module2;

public class VideoStore{

	Video[] store;
	
	public VideoStore() {
		// TODO Auto-generated constructor stub
	}

	void addVideo(String name) {
		Video vid=new Video(name);
		int storeSize;
		
		try {
			storeSize = store.length;
		} catch (Exception e) {
			storeSize = 0;
		}
		
		Video[] newStore=new Video[storeSize+1];
		newStore[storeSize]=vid;
		store=newStore;
	}
	
	void doCheckout(String name) {
		if(store==null || store.length==0) {
			System.out.println("store empty");
			return;
		}
		
		for(Video vid:store) {
			if(vid.getName().equals(name))
				vid.doCheckout();
		}
	}
	
	void doReturn(String name) {
		if(store==null || store.length==0) {
			System.out.println("store empty");
			return;
		}

		for(Video vid:store) {
			if(vid.getName().equals(name))
				vid.doReturn();
		}
	}
	
	void receiveRating(String name, int rating) {
		if(store==null || store.length==0) {
			System.out.println("store empty");
			return;
		}
		
		for(Video vid:store) {
			if(vid.getName().equals(name))
				vid.receiveRating(rating);
		}
	}
	
	void listInventory() {
		if(store==null || store.length==0) {
			System.out.println("store empty");
			return;
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
		
		for(Video vid:store) {
			System.out.println(vid.getName()+"\t\t|\t"+vid.getCheckout()+"\t\t|\t"+vid.getRating());
		}
		
		
	}
	
	
	
	
	
}
