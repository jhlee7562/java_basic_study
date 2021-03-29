package day11.poly.casting;

import day10.protect.pac2.C;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();
//        parent.m3();

        System.out.println("==================");

        Parent child = new Child();

        child.m1();
        child.m2();
        ((Child) child).m3();

        System.out.println("=======================");

        //다운캐스팅은 한번 업캐스팅이 된 객체만 사용가능함.

        Parent p = new Parent();
        if (p instanceof Child) {
            Child c = (Child) p;
        } else {
            System.out.println("변환을 수행할 수 없습니다.");
        }

    }
}