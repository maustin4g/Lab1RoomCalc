import java.util.Scanner;

//import static javafx.scene.input.KeyCode.Y;

/**
 * Created by Millicent on 1/30/2017.
 */
public class RoomCalc {
    public static void main (String [] args) {
        //1. set up resources
        Scanner scan = new Scanner(System.in);

        //2. output so the user knows what's up
        System.out.println("Welcome to the Room Calculator");
int choose = 1;
        while (choose==1) {
            //3. ask for, and capture user input
            System.out.print("Please enter height of perimeter: ");
            double length = scan.nextDouble();

            System.out.print("Please enter width of perimeter: ");
            double width = scan.nextDouble();


            //4. perform calculations
            double perimeter = (2 * length) + (2 * width);
            double area = length * width;

            //5. output results
            System.out.println("The perimeter is " + perimeter);
            System.out.println("The area is " + area);
            System.out.println("Do you want to continue? Enter 1 for yes, or 2 for No");
            choose = scan.nextInt();
        }



                System.out.println("Thank you, have a nice day!");

            }

        }

        //6. Declare and initialize variable
       // int count = 0;
       // int answer = 1;

        //7. request and capture user input
       // System.out.print("Would you like to continue? If yes enter 1, if no enter 2");
       // int answer = scan.nextInt();

        //8. Use conditional logic to create a boolean

        //6. close out resources
        //scan.close();



