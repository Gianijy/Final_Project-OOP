import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("      HANGMAN");
		
		System.out.println("  ||1. Easy     ||");
		System.out.println("  ||2. Hard     ||");
		System.out.println("  ||3. Extreme  ||");
		System.out.print("Please choose a dificulty:");
		int difficultylevel = scanner.nextInt();
		
		switch(difficultylevel) {
		case 1: 
			//Enter easy method
			System.out.println("You have chosen easy");
			break;
		case 2:
			// Enter hard method 
			System.out.println("You have chosen hard");
			break;
		case 3: 
			//Enter extreme method 
			System.out.println("You have chosen extreme");
			break;
		}
		
		
}
	
	
		
}

 class startTime {
	/*   time 
	 *  
	 * 	dko alam kung magbabawas ba tau ng time kapag 
	 * pataas ng difficulty
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
 
 
 class Hangman{
	 
	 //dito idradrawing yung tao
	 
	 public void easy() {
		 // without post stand, stage
	 }
	 
	 public void hard() {
		 // with post stand, no stage
	 }
	 
	 public void extreme() {
		 // with post stand and stage
	 }
 }
 
 
 class RandomWord{
	 // 5  words per difficulty
	 /*
	  * Randomly choosing an element in an array
	  * 
	  * use "random.choice();"
	  * 
	  * Easy = 5 letter words
	  * Hard = 7 letter words
	  * Extreme 10 letter words
	  * 
	  */
 }




