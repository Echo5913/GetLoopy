
public class Main {
    public static void main(String[] args) {

        // Task 1: Count up from 0 to 30
        System.out.println("Task 1:");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 2: Count down from 30 to 0
        System.out.println("Task 2:");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 3: Count up by 3 from 0 to 18
        System.out.println("Task 3:");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 4: Count down by 2 from 10 to 0
        System.out.println("Task 4:");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 5: Increasing triangle
        System.out.println("Task 5:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 6: Decreasing triangle
        System.out.println("Task 6:");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 7: Square of stars
        System.out.println("Task 7:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
