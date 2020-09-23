package module2;

import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch=0;
		String vName="";
		int rating=0;
		VideoStore vStore=new VideoStore();
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		while(ch!=6) {
		System.out.println("\nMAIN MENU");
		System.out.println("===========");
		System.out.println("1.Add Videos:");
		System.out.println("2.Check Out Video:");
		System.out.println("3.Return Video:");
		System.out.println("4.Receive Rating:");
		System.out.println("5.List Inventory:");
		System.out.println("6.Exit:");
		
		switch(ch) {
		case 1:
			System.out.println("Enter the name of the video you want to add: ");
			vName=sc1.nextLine();
			vStore.addVideo(vName);
			
			System.out.println("Video "+vName+" added successfully.");
			break;
		case 2:
			System.out.println("Enter the name of the video you want to check out: ");
			vName=sc1.nextLine();
			vStore.doCheckout(vName);
			
			System.out.println("Video "+vName+" checked out successfully");
			break;
		case 3:
			System.out.println("Enter the name of the video you want to return: ");
			vName=sc1.nextLine();
			vStore.doReturn(vName);
			
			System.out.println("Video "+vName+" returned successfully");
			break;
		case 4:
			System.out.println("Enter the name of the video you want to rate: ");
			vName=sc1.nextLine();
			System.out.println("Enter the rating for this video: ");
			rating=sc2.nextInt();
			vStore.receiveRating(vName, rating);
			
			System.out.println("Rating "+rating+" has been mapped to the Video "+vName+" ");
			break;
		case 5:
			vStore.listInventory();
			break;
		default:
			System.out.println("");
			break;
		}
			
		ch = sc.nextInt();
		}

		sc.close();
		sc1.close();
		sc2.close();
		System.out.println("Exiting...!! Thanks for using the application.");
	}

}
