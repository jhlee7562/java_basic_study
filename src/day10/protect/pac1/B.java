package day10.protect.pac1;

public class B {

    B() {
        A a1 = new A(1);
        A a2 = new A("dd");

        a1.f1 = 1; a1.f2 = 2;
        a1.m1(); a1.m2();
    }
}