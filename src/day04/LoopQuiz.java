package day04;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
/*
        1. 일단 1~20의 랜덤 숫자로 두 수의 덧셈문제를 1문제 출제한 후
           정답인지 오답인지 출력해보세요.
        2. 0을 입력할 때까지 반복해서 새로운 덧셈문제를 출제하고
           지속해서 정답 오답을 출력해보세요.
        3. 프로그램 종료되면 그동안의 정답횟수와
           오답횟수를 출력하세요.
        4. 빼기 기능을 추가하세요.
        5. 곱하기 기능을 추가하세요.
        6. 만약 두번째 숫자가 더 크다면 빼기 문제를 낼 때
           양수가 나올 수 있도록 앞숫자와 교체해주세요
           ex)  4 - 17 = ?    <- 이런문제가 출제될 경우
               17 - 4 = ?      <- 이렇게 바꿔서 출제할 것!
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~재미있는 사칙연산 게임~~~~");
        System.out.println("[즐겂게 문제를 풀다가 지겨우면 0을 누르세요~");
        System.out.println("# 엔터를 누르면 시작합니다");
        System.out.printf("===============================");
        sc.nextLine();

        int number1 = (int) (Math.random() * 21);
        int number2 = (int) (Math.random() * 21);

        System.out.printf("Q1) %d + %d = ?\n", number1, number2);
        System.out.printf(">>");

        int total = sc.nextInt();

        int realtotal = number1 + number2;

        if (realtotal == total){
            System.out.println("정답입니다");
        } else {
            System.out.println("오답입니다.");
            }
    }
}
