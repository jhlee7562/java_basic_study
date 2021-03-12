package day01;

public class DataType {
    public static void main(String[] args) {

       byte a = 127;
       short b = 32767;
       int c = 2147483647;
       long d = 2147483648L;
        System.out.println("d = " + d);

        int i;
        double n = 0.0;
        for (i = 0; i < 100; i++) {
            n += i;
        }
        System.out.println("0.1을 100번 더한 결과 : "+ n);

        float f1 = 3.741561516546541F; //4byte
        double d1 = 3.741651651651654165; //8byte
        System.out.println(f1);
        System.out.println(d1);

        //논리형
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 0;
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = True;

        //문자형
        //char 타입은 문자 1개를 저장할 수 있는 타입, 홑따옴표로 저장
        char a1 = 'A';
        //string 타입은 문자열을 저장할 수 있는 타입, 겹따옴표로 저장
        String s1 = "ABC";

        System.out.println("100"+"200");
        System.out.println(100+"200"); //숫자와 문자열의 덧셈만

    }
}
