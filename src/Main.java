package numgen.src;
import java.util.Scanner;   // Import the Scanner class
import java.util.Random;    //  Import the Random class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //  Create a new scanner object to take in input
        System.out.print("Enter in the minimum range: ");    //  Using print instead of println so it doesn't insert a new line
        int minValue = myObj.nextInt(); //  Take in the minimum value
        System.out.print("Enter in the maximum range: ");   //  Using print instead of println so it doesn't insert a new line
        int maxValue = myObj.nextInt(); //  Take in the maximum value
        Random rand = new Random();

        if(maxValue > minValue){
            int Output = rand.nextInt(maxValue - minValue + 1) + minValue;  //  Formula for setting max and min
            System.out.println(Output);
        } else if(maxValue <= minValue){
            System.out.println("Run the program again and this time make sure that the max value is greater than the min value!");
        }
        myObj.close();
    }
}
