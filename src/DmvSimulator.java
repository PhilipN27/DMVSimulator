import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV");

        Random random = new Random();
        int userNumber = random.nextInt(200) + 1;
        System.out.println("Your number is: " + userNumber + ". Please wait until your number is called.");

        // Call out each number, starting from the one after the user's, wrapping around, and ending with the user's number
        for (int i = userNumber + 1; i != userNumber; i++) {
            if (i > 200) {
                i = 1;
            }
            System.out.println("Now serving number: " + i);
        }

        // Finally, call the user's number
        System.out.println("Now serving number: " + userNumber);

        // Determine the message to display with a 99% chance of missing paperwork and a 1% chance of having everything
        if (random.nextInt(100) < 99) {
            System.out.println("Sorry, you do not have the required paperwork.");
        } else {
            System.out.println("You have all of the required paperwork and you are all set.");
        }
    }
}
