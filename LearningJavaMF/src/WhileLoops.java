import java.util.*;
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

        String password = "password";

        String pass = "";


        while (password.equalsIgnoreCase(pass) == false) {
            
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your password: \n");
            pass = input.nextLine();

            if (password.equalsIgnoreCase(pass) != true){
                System.out.println("Incorrect password! ");           
            }


        }

        System.out.println("Access granted!");

    }
    

	}


