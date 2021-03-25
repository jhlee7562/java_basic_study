package day09.inherit.player;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("전사킹짱짱이");
        w.info();

        Mage m = new Mage("대마봅사");
        m.info();

        Hunter h = new Hunter("활쟁이");
        h.info();
    }

}
