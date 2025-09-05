import java.util.*;


public class testDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dl = new DVD("star Trek","PG-13",105);
		DVD dm = new DVD("Coco","PG-13",110);
		DVD dw = new DVD("Joker","R",90);

		DVDCollection example = new DVDCollection();
		example.addOrModifyDVD("Coco", "R", "110");
		example.addOrModifyDVD("Joker", "Pg-13", "104");
		example.addOrModifyDVD("Choco", "Pg", "110");		
		example.addOrModifyDVD("La La Land","R","128");  
		example.addOrModifyDVD("Coco","PG","105");  
		example.addOrModifyDVD("Parasite","R","132");  
		
	
		System.out.println( "Old list: \n" + example.toString() +" \n");

		System.out.print("Total Run Time: " + example.getTotalRunningTime() + '\n');
		
//		System.out.print("Dvds by Rating: " + example.getDVDsByRating("PG"));
		
		example.removeDVD("Choco");
		System.out.println( "New list: \n" + example.toString() +" \nFinished.");
		
//		DVDCollection playList = new DVDCollection();
	


		
		

		
	}

}
