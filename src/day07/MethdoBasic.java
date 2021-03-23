package day07;

import java.util.Arrays;
import java.util.function.Function;

public class MethdoBasic {

    static int calculateTotal(int n){//매개변수
        int total = 0;
        for(int i = 0; i <= n; i++){
            total += i;
        }
        return total;
    }
    
    //n개의 정수의 총합
    static int calcNumbersTotal(int... numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    static String selectRandomFood(){
        String[] foods = {"김밥", "볶음밥", "오렌지", "닭강정", "귤"};
        return foods[(int) (Math.random() * foods.length)];
    }

    public static void main(String[] args) {

        int result = calculateTotal(10);
        System.out.println("result = " + result);

        int result2 = calculateTotal(100);
        System.out.println("result2 = " + result2);

        System.out.println("food = " + selectRandomFood());

        System.out.println("==================================================");

        int total = calcNumbersTotal(new int[]{10, 20, 30, 100, 200});
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal(10,20,40,80,99);
        System.out.println("total2 = " + total2);

        System.out.println("==================================================");

        sayHello ("멍청이");

        System.out.println("=================================================");

        int[] results = poperateAll(20,5);
        System.out.println(Arrays.toString(results));
    }//end main

    //사용자의 이름을 전달하면 인사를 출력해주는 함수
    static void sayHello(String userName){
        System.out.println(userName +  "님 안녕하세요");
    }

    //여러값을 리턴하고 싶은 경우
    static int[] poperateAll(int n1, int n2){
        return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }


}//end class