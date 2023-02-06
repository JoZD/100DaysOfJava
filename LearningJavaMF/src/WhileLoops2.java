
import javax.swing.*;
import java.util.*;

// Guess the number :D Day 4 Day 4 Day 4
public class WhileLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int number = rand.nextInt(101); // This generates a random number 101 is not included, the last one is 100

		Scanner input = new Scanner(System.in);

		int attempts  = 0;
		int numba = 101;

		while (numba != number){
			attempts++;
			System.out.println("Guess the number! :D ");
			numba = input.nextInt();
			

			if (number > numba){
				System.out.println("The number is higher than that");

			}
			
			else if (number < numba){
				System.out.println("The number is lower than that");
			}
			
		}
		System.out.println("Correct, that is the number! You got this in " + attempts + " attempts");

		



	}

}
