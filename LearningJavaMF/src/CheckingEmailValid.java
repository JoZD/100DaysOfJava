

import java.util.*;
public class CheckingEmailValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean	att = false;

		Scanner input  = new Scanner(System.in);

		System.out.println("Please enter the email to be tested: \n");

		String email = input.nextLine();

		//Check if email contains an @

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') { // CharAt takes an index as parameter, and checks for equality, for this example it will check all indexes
				att = true;


		}



} // end of for loop 

		if (att == false){
			System.out.print("Email is not valid ");

		}
		else{
			System.out.println("Email is valid ");
		}

} //end of main



} // end of class 
