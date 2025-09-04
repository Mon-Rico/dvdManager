import java.util.*;


public class testDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DVDCollection playList1 = new DVDCollection();
		DVD dl = new DVD("Coco","PG-13",105);
		
		String example = "";
		example = dl.toString();
		System.out.println("example data type: " + example.getClass().getName());
		System.out.println( example +" \nFinished.");
	}

}
