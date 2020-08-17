package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Requirement 1: Ask the user what number they want to translate
        System.out.println("What is the number to translate?");
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();


        //Requirement 2: Ask the user what the target output language is
        System.out.println("What is the output language ([1]French or [2]German)?");
        String optionAsString = scanner.nextLine();
    }
}
