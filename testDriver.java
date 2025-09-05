import java.util.*;


public class testDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dl = new DVD("star Trek","PG-13",105);
		DVD dm = new DVD("Coco","PG-13",110);
		DVD dw = new DVD("Joker","R",90);

		DVDCollection example = new DVDCollection();
		example.addOrModifyDVD("Coco", "R", "110");
		example.addOrModifyDVD("Joker", "R", "104");
		example.addOrModifyDVD("Choco", "R", "110");		
		
		
	
//		System.out.println("example data type: " + example.toString());
		System.out.println( example.toString() +" \nFinished.");
		
//		DVDCollection playList = new DVDCollection();
	


		
		

		
	}

}
