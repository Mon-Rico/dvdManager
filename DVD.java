public class DVD {

	// Fields:

	private String title;		// Title of this DVD
	private String rating;		// Rating of this DVD
	private int runningTime;	// Running time of this DVD in minutes

	//Construtor sets all attributes to its respective variables: title, rating, runningTime; Unless said otherwise
	public DVD(String dvdTitle, String dvdRating, int dvdRunningTime) 
	{
		setTitle(dvdTitle);
		setRating(dvdRating);
		setRunningTime(dvdRunningTime);
	}
	
	// All getter functions return respective private variable
	
	public String getTitle() 
	{
		return title;	
	}
	
	public String getRating() 
	{
		return rating;	
	}
	
	public int getRunningTime() 
	{
		return runningTime;	
	}

	
	// All setter functions give their respective variables the parameter's value and return nothing.
	// In other words, setter functions, set the parameter's value to their proper variables.
	public void setTitle(String newTitle) {
		
		title = newTitle;
	}

	public void setRating(String newRating) {
		rating = newRating;
	}

	public void setRunningTime(int newRunningTime) {
		runningTime = newRunningTime;
	}
	
	//takes an element and converts it into a whole string
	public String toString() {
		
		String newlyMadeString = getTitle() + '/' + getRating() + '/' + getRunningTime();
		return newlyMadeString;	
	}
	
	
}
