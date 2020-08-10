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

        //Till 30
        List<String> germanTranslations =  new ArrayList<>();
        germanTranslations.add("Einz");

        //Till 30
        List<String> frechTranslations =  new ArrayList<>();
        frechTranslations.add("Un");


        System.out.println("What is the number to translate?");
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        Integer number = null;
        try {
            number = Integer.parseInt(numberAsString);
            System.out.println(number);
        } catch (NumberFormatException nfe) {
            /* */
            System.out.println("The number has to be numeric. Please try again");
            /*System.exit();*/
        }
        System.out.println("What is the language ([1]French or [2]German)?");
        String optionAsString = scanner.nextLine();

        Integer option = null;
        try {
            option = Integer.parseInt(numberAsString);
            System.out.println(option);
        } catch (NumberFormatException nfe) {
            /* */
            System.out.println("The number has to be numeric. Please try again");
            /*System.exit();*/
        }
        //Check that the option is 1 or 2
        if (option == 1) {
            String translation = frechTranslations.get(number-1);
            System.out.println("The translation is: " + translation);
        }
        else if (option == 2) {

        }
        else {
            System.out.println("Please choose either [1]French or [2]German");
        }


    }
}
