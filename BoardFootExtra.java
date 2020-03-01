import java.util.Scanner;

/**
* The BoardFootExtra program implements an application that calculates the height of a board given 
* the length and the width in order to achieve a certain area.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-03-01 
*/


public class BoardFootExtra {
  // Create variables 
  static double width;
  static double length;
  
  // stupidly hard/picky to make function
  // returns the height when called
  static double boardFootFunc(double widthInput, double lengthInput) {
    return new Double(144 / (widthInput * lengthInput));
  }
  
  /**
  * Calculates and outputs the height based on the users input.
  */
  
  public static void main(String[] args) {
    // Create scanner
    Scanner userInput = new Scanner(System.in);
    try {
      // Ask for input
      System.out.println("Input the width.");
      width = userInput.nextDouble();
      if (width <= 0) {
        // Informs the user that their input is invalid
        System.out.println("Value must be larger than 0.");
      } else {
        System.out.println("Input the length.");
        length = userInput.nextDouble();
        if (length <= 0) {
          // Informs the user that their input is invalid
          System.out.println("Value must be larger than 0.");
        } else {
          // calls the function
          double height = boardFootFunc(width, length);
          // outputs the answer
          System.out.println("The height is " + height + ".");
        }
      }
    } catch (Exception e) {
      // Informs the user that their input is invalid
      System.out.println("Invalid Input");
    }
  }
}