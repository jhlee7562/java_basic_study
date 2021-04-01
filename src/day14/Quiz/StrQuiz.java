package day14.Quiz;

import day14.Quiz.UserData;

import java.util.*;

public class StrQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호: ");
        String ssn = sc.next();

        String fistNumber = ssn.substring(0, 6);
        System.out.println("앞자리 : " + fistNumber);

        String lastNumber = ssn.substring(ssn.lastIndexOf("-") + 1);
        System.out.println("뒷자리 : " + lastNumber);

        UserData userData = new UserData(ssn);
        userData.printUserInfo();

        sc.close();
    }
}