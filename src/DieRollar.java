import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int rollCount = 0;
        boolean continueRolling = true;

        System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
        System.out.println("----------------------------------------------------------");

        while (continueRolling) {
            rollCount++;
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int die3 = rand.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", rollCount, die1, die2, die3, sum);

            if (die1 == die2 && die2 == die3) {
                System.out.println("Triple rolled! Ending...");
                break;
            }

            System.out.print("Roll again? (y/n): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                continueRolling = false;
            }
        }
        scanner.close();
    }
}