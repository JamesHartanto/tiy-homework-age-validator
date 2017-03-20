import java.util.Scanner;

/**
 * Created by JamesHartanto on 3/20/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        try {
            System.out.println("Please enter your age: ");
            String input = scanner.nextLine();
            validator.validateAge(input);
        } catch (Exception e) {
            System.out.println("There was an error: " + e.getMessage());
        }
    }
}
