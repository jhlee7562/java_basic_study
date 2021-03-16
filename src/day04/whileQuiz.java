package day04;

import java.util.Scanner;

public class whileQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("정수 1 : ");
        int x = sc.nextInt();

        System.out.printf("정수 2 : ");
        int y = sc.nextInt();

        sc.close();

        int total = 0;
        /*int n = x;
        while (n =< y) {
            total += n;
            n++;
        }*/

        for (int n = x; n <= y; n++) {
            total += n;
        }
        System.out.printf("%d~%d 까지의 총합 : %d\n", x, y, total);

    }
}