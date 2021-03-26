package day10.final_;

class Child extends Prent {

    Prent p = new Prent();

    @Override
//    void m1() {
    void m2() {
        m1();
    }
}

//public final class Prent {
class Prent {

    final void m1() {}
    void m2() {}
}