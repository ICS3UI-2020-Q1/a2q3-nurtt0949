import java.util.Scanner;

/**
 *This program determinds the order of 2 integers
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
   Scanner input = new Scanner(System.in);

   //ask user for an integers
   System.out.println("Enter an integer");

    //get integer from user
  int integer1 = input.nextInt();
  
   //ask user to chose another integer
  System.out.println("Enter another integer");

  //get integer from user
  int integer2 = input.nextInt();

  //calculate greater number
  if(integer1 < integer2){
  
  //tell user their numbers in ascending order
  System.out.println("Your numbers in ascending order are " + integer1 + "," + integer2);

 } else if (integer2 > integer1){

  //tell user their number in ascending order
  System.out.println("Your numbers in acending order are " + integer1 + "," +  integer2);
  
  
  
  } 
  }
}
