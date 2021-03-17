package day05;

import java.util.*;

public class ArraySearchQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수"
                , "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String targetName = sc.next();

            int idx;
            for (idx = 0; idx < tvxq.length; idx++) {
                if (targetName.equals(tvxq[idx])) {
                    break;
                }
            }

            if (idx < tvxq.length) { //찾아냄
                System.out.println(tvxq[idx] + "의 별명을 변경합니다.");
                System.out.print("> ");
                tvxq[idx] = sc.next();
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                sc.close();
                break;
            } else { //못찾음
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        }

    }
}

/*
package day05;

import java.util.Scanner;

public class ArraySerchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("* 변경 전 정보 [영웅재중, 최강창민, 시아준수, 믹키유천, 유노운호]");
        System.out.println("수정 할 멤버의 이름을 입력하세요");

        String[] name = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        while (true) {
            System.out.print(">");
            String chname = sc.nextLine();

            boolean containName = false;
            int i;
            for (i = 0; i < name.length; i++) {
                if (chname.equals(name[i])) {
                    containName = true;
                    break;
                }
            }

            if (containName == true) {
                System.out.println("- 수정할 멤버의 이름을 입력하세요");
                System.out.print("%s의 별명을 변경합니다");



            } else {
                System.out.printf("%s은(는) 없는 이름입니다.", chname);
            }

//       System.out.println("변경");
        }

    }
}*/