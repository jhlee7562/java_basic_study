package day07;

import java.util.Arrays;

public class MethodQuiz2 {

    static double[] calcArrayTotal(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        double average = total / (double) numbers.length;
        return new double[]{total, average};
    }

    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrToAvg = calcArrayTotal(numbers);
        System.out.printf("총점 : %d점, 평균 : %.2f점\n", (int) arrToAvg[0], arrToAvg[1]);
    }
}