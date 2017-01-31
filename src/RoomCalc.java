import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;

/**
 * Created by Millicent on 1/30/2017.
 */
public class RoomCalc {
    public static void main (String [] args) {
        //1. set up resources
        Scanner scan = new Scanner(System.in);

        //2. output so the user knows what's up
        System.out.println("Welcome to the Room Perimeter Calculator");

        //3. ask for input
        System.out.print("Please enter height of perimeter: ");
        double length = scan.nextDouble();

        System.out.print("Please enter width of perimeter: ");
        double width = scan.nextDouble();


        //4. perform calculations
        double perimeter = (2 *length) + (2 * width);
        double area = length * width;

        //5. output results
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);


        //6. close out resources
        scan.close();

        System.out.println();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println();
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        BooleanFlag;
        for(again = Y; i<11; i++){
            System.out.println("Count is: " + i)
    }
}
