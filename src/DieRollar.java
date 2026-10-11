
import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            int roll = 0;
            int die1, die2, die3;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("-----------------------------------------------");

            do {
                roll++;

                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n",
                        roll, die1, die2, die3, sum);

            } while (die1 != die2 || die2 != die3);

            System.out.println("You rolled three of a kind!");
            System.out.print("Play again? (y/n): ");
            answer = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}
