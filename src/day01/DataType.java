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

    }
}
