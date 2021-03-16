package day04;

import java.util.Scanner;

public class forQuiz {
    public static void main(String[] args) {

        int level = (int) (Math.random() * 10);

        System.out.printf("랜덤 구구단 %d단\n", level);
        System.out.println("==============================");

        for (int line = 1; line <= 9; line++){
            System.out.printf("%d x %d = %d\n", level, line, level * line);
        }


       /* int number1 = 2;
        int total = 0;

        for (int n = 1; n <= 9; n++) {
            total = number1 * n;
        System.out.printf("%d x %d = %d \n", number1, n, total);
        }*/
    }
}
