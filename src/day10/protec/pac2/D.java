package day10.protec.pac2;

import day10.protec.pac1.A;

public class D extends A {

    protected D(String b) {
//        super(10); //default
        super("안녕"); //protected

//        this.f1 = 10; //default
        this.f2 = 11;// protected

//        m1(); //default
        m2(); //protected
    }
}