package day13.exception;

import day10.protect.pac1.B;

import java.util.Scanner;

class Basic {

    int number;

    public Basic(int n) {
        try {
            this.number = aaa(n);
        } catch (Exception e) {
            System.out.println("n에는 0을 전달하면 안됩니다.");
        }
    }

    public int aaa(int n) throws Exception {
        return bbb(n) / n;
    }
    public int bbb(int n) throws Exception {
        return ccc(n) / n;
    }
    public int ccc(int n) throws Exception {
        return 100 / n;
    }
}

public class ThrowsEx {
    public static void main(String[] args) throws Exception {

        Basic basic = new Basic(0);
        System.out.println(basic.number);

        System.out.println("프로그램 종료");

        new Scanner(System.in).nextInt();

    }

}
