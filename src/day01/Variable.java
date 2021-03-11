package day01;
//지역변수, 전역변수
public class Variable {
    public static void main(String[] args) {
        //변수 선언
        int number = 20;
//        int point =  48.9 선업타입이 다르면 저장 불가

        number = 70;
        System.out.println("number = " + number);

        int tripeNumber = number * 3;
        System.out.println("tripNumber = " + tripeNumber);

        String name = "김철수";
        System.out.println("name = " + name);

        //변수의 범위 : 변수는 선언된 블록을 벗어나면 메모리에서 제거된다.
        int n1 = 1, n2 = 2;

        if (true){
            int n3 = n1 + n2;
//            int n3 = 10;
        }//end if

//        System.out.println(n3);
        int n3 = 100;
    }//end main
//    int n4 = n1 + n2;
}//end class
