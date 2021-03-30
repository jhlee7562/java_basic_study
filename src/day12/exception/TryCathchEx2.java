package day12.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCathchEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1 : ");
            int n1 = sc.nextInt(); //위험

            System.out.print("정수2 : ");
            int n2 = sc.nextInt(); //위험

            int divResult = n1 / n2; //위험
            System.out.println("divRsult = " + divResult);
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력해주세요.");
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외상황입니다. 점검하겠습니다.");
        }

        System.out.println("프로그램 정상 종료");
        sc.close();
    }
}
