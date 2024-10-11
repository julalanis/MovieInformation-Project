public class Director {
	//------------------------ named variables ------------------------
	private String name;
	private int yearsOfDirecting;
	private boolean oscarWinner;
	
	//------------------------ constructor that accepts nothing ------------------------
	Director(){
	}
	
	//------------------------ constructor that accepts named parameters ------------------------
	Director(String name, int yearsOfDirecting, boolean oscarWinner){
		this.name = name;
		this.yearsOfDirecting = yearsOfDirecting;
		this.oscarWinner = oscarWinner;
	}

	//------------------------ get methods for 3 variables ------------------------
	String getName() {
		return name;
	}
	
	int getYearsOfDirecting() {
		return yearsOfDirecting;
	}
	
	boolean getOscarWinner() {
		return oscarWinner;
	}
	
	//------------------------ set methods for 3 variables ------------------------
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setYearsOfDirecting(int yearsDirecting) {
		this.yearsOfDirecting = yearsDirecting;
	}
	
	public void setOscarWinner(boolean isWinner) {
		this.oscarWinner = isWinner;
	}
	
	//------------------------ toString method to list variables------------------------
	
	public String toString() {
		return "Director name: " + name + "\n" +
			   "Years of Directing: " + yearsOfDirecting + "\n" +
			   "Oscar Winner: " + oscarWinner;
	}

	}

