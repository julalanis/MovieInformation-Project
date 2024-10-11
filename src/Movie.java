//------------------------ importing BigInteger ------------------------
import java.math.BigInteger;

//------------------------ named variables ------------------------
public class Movie {
	private String title;
	private Director director;
	private BigInteger budget;
	private BigInteger boxOffice;
	
	//------------------------ constructor that accepts nothing ------------------------
	Movie(){
		this.budget = BigInteger.ZERO;
		this.boxOffice = BigInteger.ZERO;
	}
	
	//------------------------ constructor that accepts named parameters ------------------------
	Movie(String title, Director director, BigInteger budget, BigInteger boxOffice){
		this.title = title;
		this.director = director;
		this.budget = budget;
		this.boxOffice = boxOffice;
	}
	
	//------------------------ get methods for 4 variables ------------------------
	
	String getTitle() {
		return title;
	}
	
	Director getDirector() {
		return director;
	}
	
	BigInteger getBudget() {
		return budget;
	}
	
	BigInteger getBoxOffice() {
		return boxOffice;
	}
	
	//------------------------ set methods for 4 variables ------------------------
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setDirector(Director newDirector) {
		this.director = newDirector;
	}
	
	public void setBudget(BigInteger newBudget) {
		this.budget = newBudget;
	}
	
	public void setBoxOffice(BigInteger newBoxOffice) {
		this.boxOffice = newBoxOffice;
	}
	
	//------------------------ isProfitable method ------------------------

	
	public boolean isProfitable() {
		
		return boxOffice.compareTo(budget) > 0;
	}

	//------------------------ isTitleLong method ------------------------
	
	public boolean isTitleLong() {
		String titleSplit[] = title.split(" ");
		
		 int wordCount = titleSplit.length;
		 
		 return wordCount > 4;
		
	}
	
	//------------------------ toString method to list variables------------------------
	public String toString() {
				return "Movie: " + title + "\n" +
					   "Director: " + director + "\n" +
				       "Budget: $" + budget + "\n" +
					   "Box Office: $" + boxOffice + "\n";
	}

}
