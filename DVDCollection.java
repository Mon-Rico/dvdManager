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

		String newlyMadeString = "";
		//for each element in the array
		for(int dvdIndex = 0; dvdIndex < numdvds; dvdIndex++){

			newlyMadeString += dvdArray[dvdIndex].toString() + '\n';
		}
		
		return newlyMadeString;	
	}

	public void addOrModifyDVD(String title, String rating, String runningTime) {
		// NOTE: Be careful. Running time is a string here
		// since the user might enter non-digits when prompted.
		// If the array is full and a new DVD needs to be added,
		// double the size of the array first.
		
		int runTime = Integer.parseInt(runningTime);
		
		DVD dvdObject = new DVD(title,rating,runTime);
		
		
		//create bigger array if current array is full
		if(numdvds == dvdArray.length) {
			//create bigger array
			DVD[] dvdA = new DVD[14];
			//copy all elements from previous array
			for(int i = 0; i < numdvds; i++) {
				dvdA[i] = dvdArray[i];
			}
			this.dvdArray = dvdA;
		}
		
	
		for(int dvdIndex = 0; dvdIndex < dvdArray.length; dvdIndex++) {

			if(dvdArray[dvdIndex] == null){
				dvdArray[numdvds] = dvdObject;
				numdvds++;
				break;
			}

			//check if title exist
			if(dvdObject.getTitle().compareTo(dvdArray[dvdIndex].getTitle()) == 0) {
				//modify
				dvdArray[dvdIndex].setRating(dvdObject.getRating());
				dvdArray[dvdIndex].setRunningTime(dvdObject.getRunningTime());
				modified = true;
			}
		}

		//sort everything to be alphabetical order by title -failed
	}
	
	public void removeDVD(String title) {
		for(int dvdIndex = 0; dvdIndex < numdvds; dvdIndex++) {

			if(title.toUpperCase() == dvdArray[dvdIndex].getTitle() ) {
				dvdArray[dvdIndex] = null;
				numdvds--;

				modified = true;
			}
		}

	}
	
	public String getDVDsByRating(String rating) {
		
		String newlyMadeString = "";

		for(int dvdIndex = 0; dvdIndex < numdvds; dvdIndex++){
			
			if(rating.toUpperCase() == dvdArray[dvdIndex].getRating())
				newlyMadeString += dvdArray[dvdIndex].getTitle() + '\n';
		}

		return newlyMadeString;

	}

	public int getTotalRunningTime() {
		
		int totalRunningTime = 0;

		//for every element in the collection
		for(int dvdIndex = 0; dvdIndex < numdvds; dvdIndex++) {
		//get the running time of every element
			totalRunningTime += dvdArray[dvdIndex].getRunningTime();
		}
		//sum the total and return
		return totalRunningTime;
	}

	
	public void loadData(String filename) {
		





		
	}
	
	public void save() {







	}

	// Additional private helper methods go here:



	
}
