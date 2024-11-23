package Task1_Task2_Task3;

import java.util.*;

public class Solve {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    	// Task3
        System.out.println("Enter the number of competitors in the long jump competition: ");
        int competitors = reader.nextInt();
        // Task1
        System.out.println("Give me the jump results (in centimeters) of the competitors:");

        double best_result = 0;
        double sum = 0;

        for (int i = 1; i <= competitors; i++) {
            System.out.println("Competitor " + i + " result: ");
            double comp_score = reader.nextDouble();

            if (comp_score > best_result) {
                best_result = comp_score;
            }

            // Task2
            if (comp_score > 500) {
                sum += comp_score;
            }
        }

        double score_avg = sum / competitors;

        System.out.println("The best competitor result is: " + best_result);
        System.out.println("The Average score is: " + score_avg);
    }
}