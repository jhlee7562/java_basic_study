package day05;

import java.util.*;

public class ArrayInsertQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        //음식명을 저장할 배열 생성
//        String[] foods = new String[0];
        String[] foods = {}; //빈 배열

        while (true) {
            System.out.print("> ");
            String foodName = sc.nextLine();

            if (foodName.equals("그만")) {
                System.out.println("입력종료!");
                sc.close();
                break;
            }
            String[] temp = new String[foods.length + 1];

            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }

            temp[temp.length - 1] = foodName;
            foods = temp; temp = null;
        }//end while

        System.out.println("먹고싶은 음식: " + Arrays.toString(foods));
    }
}