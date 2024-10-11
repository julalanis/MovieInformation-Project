/** Student Name: Julie Alanis
 * Date Compelted: 10/05/2024
 * Project No.& Page No.: Chapter 10 PP Julie Alanis
 * Extra Credit: No
 * Project Description: This driver class called MovieInformation uses the classes Movie and Director in order to create,
 * 						access and mutate respective Director and Movie objects. Also included within both Director and Movie
 * 						classes are methods toString() which return an object's variable values. In Movie class, there are two
 * 						more methods: the isProfitable() method which compares the budget and boxOffice BigIntegers to determine
 * 						whether or not a Movie object was profitable, and the isTitleLong() method which takes the title String
 * 						of the Movie object, splits it into separate words and counts those words in order to determine if a Movie
 * 						object title is longer than 4 words.
 **/
import java.math.BigInteger;
public class MovieInformation {

	public static void main(String[] args) {
		//create 3 Director objects
		Director director1 = new Director();
		Director director2 = new Director ("Julie A.", 4, true);
		Director director3 = new Director("Tato", 10, false);
		
		System.out.println("Three Directors have been created. \n" +
						   "Calling the \"toString\" method of the Director class");
		
		//use toString method on all Director objects
		System.out.println(director1.toString() + "\n");
		System.out.println(director2.toString() + "\n");
		System.out.println(director3.toString() + "\n");
		
		//using setters on first Director object to change its values
		director1.setName("Mary K.");
		director1.setYearsOfDirecting(2);
		director1.setOscarWinner(true);
		
		System.out.println("Calling the mutator methods on the first Director object \n" +
						   "First Director has been changed by the mutator methods: \n" +
						   "Now showing the changed first Director by calling \n" +
						   "the accessor methods \n");
		
		//using getter to print new first Director object's values
		System.out.println("First Director's name: " + director1.getName());
		System.out.println("First Director has been directing for " + director1.getYearsOfDirecting() + " years");
		System.out.println("First Director has won the Oscar for best Director: " + director1.getOscarWinner() + "\n");
		
		//Create the movies array to store the Movie objects
		Movie[] movies = new Movie[3];
		 movies[0] = new Movie();
		 movies[1] = new Movie("Hello World!" , director1, new BigInteger("5"),new BigInteger("100"));
		 movies[2] = new Movie("This is a Very Long Title Full of Words", director3, new BigInteger("200"), new BigInteger("10"));
		
		System.out.println("Three Movies have been created.");
		System.out.println("Calling the \"toString\" method of the Movie class");
		
		//loop to invoke toString method on each Movie object
		for (int i = 0; i < movies.length; i++) {
		System.out.println(movies[i].toString());
		}
	
		//set new values for first Movie object
		movies[0].setTitle("Sharks and Sharks");
		movies[0].setDirector(director2);
		movies[0].setBudget(new BigInteger("20"));
		movies[0].setBoxOffice(new BigInteger("300"));
		
		System.out.println("Calling the mutator methods on the first Movie object \n" +
		"First Movie has been changed by the mutator methods: \n" +
		"Now showing the changed first Director by calling \n" +
		"the accessor methods \n");
		
		//call first Movie object with new values from before using getters since toString was already used
		System.out.println("First movie's title is: " + movies[0].getTitle());
		System.out.println("First movie's director is: " + movies[0].getDirector());
		System.out.println("First movie's budget is $" + movies[0].getBudget());
		System.out.println("First movie's boxOffice is $" + movies[0].getBoxOffice() + "\n");
		
		System.out.println("Evaluating if each movie made money \n" +
						   "by calling the \"isProfitable\" method of the movie class \n");
		
		//loop to invoke isProfitable method on all Movie objects
		for (int j = 0; j < movies.length; j++) {
			if (movies[j].isProfitable()) {
				System.out.println(movies[j].getTitle() + " is profitable");
			} else {
			System.out.println(movies[j].getTitle() + " is not profitable");
			}
		}
		
		System.out.println();
		System.out.println("Evaluating if each movie's title is long \n" + 
						   "by calling the \"isTitleLong\" method: \n");
		
		//loop to invoke isTitleLong method on all Movie objects
		for (int k = 0; k < movies.length; k++) {
			if (movies[k].isTitleLong()) {
				System.out.println(movies[k].getTitle() + " has a long title");
			} else {
				System.out.println(movies[k].getTitle() + " is of a regular length");
		}
	}
	
	System.out.println();
	System.out.println("That's all the information I have...\n" +
					   "Thank you for visiting...");
  }
}