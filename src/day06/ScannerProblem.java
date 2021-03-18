package day06;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int n = sc.nextInt();

        System.out.print("문자열: ");
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println("str = " + str);

        System.out.println("입력종료!");
        sc.close();
    }
}