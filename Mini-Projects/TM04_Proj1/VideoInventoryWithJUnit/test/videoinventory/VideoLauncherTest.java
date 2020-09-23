package videoinventory;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoLauncherTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Video v = new Video("video 1");
		
		assertTrue(v.getName().equals("video 1"));		//name = video 1
		
		assertFalse(v.getCheckout());		//getCheckout function returns false
		v.doCheckout();				//checkout = true
		assertTrue(v.getCheckout());		//getCheckout function returns true as the video is taken
		
		assertEquals(0, v.getRating());		//no rating received so will return 0
		v.receiveRating(4);			//rating received as 4
		assertEquals(4, v.getRating());		//returns the rating 4
		
		assertTrue(v.getCheckout());		//getCheckout function returns true
		v.doReturn();				//checkout = false
		assertFalse(v.getCheckout());		//getCheckout function returns false as video is returned	
		
	}

}
