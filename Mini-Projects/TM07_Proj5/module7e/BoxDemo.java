package module7e;

import java.util.*;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Box> hc = new HashSet<Box>();
		
		Scanner sc = new Scanner(System.in);
		int boxesNumber=0;
		System.out.println("Enter the number of Box");
		boxesNumber = sc.nextInt();
		
		for(int i=0;i<boxesNumber;i++) {
			Box b = new Box();
			System.out.println("Enter the Box "+(i+1)+" details");
			System.out.println("Enter Length");
			b.setLength(sc.nextDouble());
			System.out.println("Enter Width");
			b.setWidth(sc.nextDouble());
			System.out.println("Enter Height");
			b.setHeight(sc.nextDouble());
			
			hc.add(b);
			System.out.println();
		}
		
		System.out.println("Unique Boxes in the Set are");
		for(Box b:hc) {
			System.out.println("\nLength ="+b.getLength()+" Width ="+b.getWidth()+" Height ="+b.getHeight()+" Volume ="+b.getVolume());
		}
		
		
		
		System.out.println();
		sc.close();
	}

}
