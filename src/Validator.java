
import java.util.Scanner;

/**
 * Created by JamesHartanto on 3/20/17.
 */
public class Validator {

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    //Method to validate age
    public boolean validateAge(String string) throws Exception{
        // checking if numeric
        if (!isNumeric(string)){
            throw new Exception("Not numeric: Age must be a number.");
        }
        // checking if integer
        if (string.contains(".")){
            throw new Exception("Not an integer: Age must be an integer.");
        }
        if (Integer.parseInt(string) < 18){
            throw new Exception("Less than 18: You must be over 18.");
        }
        if (Integer.parseInt(string) > 115){
            throw new Exception("Greater than 115: You appear to be lying about your age");
        }
        else {
            System.out.println("Welcome to the Website!");
            return true;
            }
    }
}
