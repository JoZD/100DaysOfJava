import java.math.*;
import java.util.*;

import javax.swing.JOptionPane;


// Day 4 Day 4 Day 4
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please select an option: \n1: Square \n 2: Rectangle \n 3:Triangle \n 4: Circle");
		int option = input.nextInt();


		// Select the figure based on the number selected

		switch (option){
			case 1: 
			int side = Integer.parseInt( JOptionPane.showInputDialog("Please enter the side to calculate the area of the square"));
			System.out.println("The area of the square is: " + Math.pow(side, 2)); break;

            case 2: 
			int base = Integer.parseInt( JOptionPane.showInputDialog("Please enter the base to calculate the area of the rectangle"));
			int height = Integer.parseInt( JOptionPane.showInputDialog("Please enter the height to calculate the area of the rectangle"));
			System.out.println("The area of the rectangle is: " + base * height); break;

            case 3:
			int trianglebase = Integer.parseInt(JOptionPane.showInputDialog("Please enter the base to calculate the area of the triangle"));
			int theight = Integer.parseInt( JOptionPane.showInputDialog("Please enter the height to calculate the area of the triangle"));
			System.out.println("The area of the rectangle is: " + (trianglebase * theight) /2 ); break;


            case 4:
			int radius = Integer.parseInt(JOptionPane.showInputDialog("Please enter the base to calculate the area of the triangle"));
			System.out.printf("1,2f","The area of the rectangle is: " + (Math.PI * (Math.pow(radius,2))) ); break; // (1.2f formats decimals)

		}

}
}