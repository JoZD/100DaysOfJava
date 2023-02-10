import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program will calculate the ideal weight for a person, based on gender and height (not a real formula, just to test functionality)


		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Please enter your gender");

		}while(genero.equalsIgnoreCase("h")== false && genero.equalsIgnoreCase("m")== false );


		int height = Integer.parseInt(JOptionPane.showInputDialog("Please enter height in cm"));



		if (genero.equalsIgnoreCase("m")) {
			System.out.println(height -120);

		}

		else if (genero.equalsIgnoreCase("h")) {
			System.out.println(height -110);

		  
	}

}

}