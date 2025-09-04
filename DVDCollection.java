import java.io.*;

public class DVDCollection {

	// Data fields
	
	/** The current number of DVDs in the array */
	private int numdvds;
	
	/** The array to contain the DVDs */
	private DVD[] dvdArray;
	
	/** The name of the data file that contains dvd data */
	private String sourceName;
	
	/** Boolean flag to indicate whether the DVD collection was
	    modified since it was last saved. */
	private boolean modified;
	
	/**
	 *  Constructs an empty directory as an array
	 *  with an initial capacity of 7. When we try to
	 *  insert into a full array, we will double the size of
	 *  the array first.
	 */
	public DVDCollection() {
		numdvds = 0;
		dvdArray = new DVD[7];
		modified = false;
	}
	
	public String toString() {
		// Return a string containing all the DVDs in the
		// order they are stored in the array along with
		// the values for numdvds and the length of the array.
		// See homework instructions for proper format.

		String newlyMadeString = null;
		//Have some string variable to return
		
		System.out.println("numdvds = " + numdvds);
		System.out.println("dvdArray.length = " + dvdArray.length);

		//The sorting algorithm
		
		//The printing lines
		
		//for each element in the array
		for(DVD index: dvdArray){
			//convert element to string 
			newlyMadeString = index.toString();
			System.out.println(newlyMadeString + '\n');
			return newlyMadeString;
		}
		

		//return whole newly changed array
		return newlyMadeString;	
	}

	public void addOrModifyDVD(String title, String rating, String runningTime) {
		// NOTE: Be careful. Running time is a string here
		// since the user might enter non-digits when prompted.
		// If the array is full and a new DVD needs to be added,
		// double the size of the array first.


	
	}
	
	public void removeDVD(String title) {
		


	}
	
	public String getDVDsByRating(String rating) {






		return null;	// STUB: Remove this line.

	}

	public int getTotalRunningTime() {







		return 0;	// STUB: Remove this line.

	}

	
	public void loadData(String filename) {






		
	}
	
	public void save() {







	}

	// Additional private helper methods go here:



	
}
