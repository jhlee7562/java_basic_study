package day15.generic;

import day10.protect.pac1.B;

public class Main {
    public static void main(String[] args) {

        Basket<Apple> ab = new Basket<>();
        ab.setFruit(new Apple());

        Apple apple = ab.getFruit();
        System.out.println("apple = " + apple);

        System.out.println("==========================");

        Basket<Peach> pb = new Basket<>();
        pb.setFruit(new Peach());

        Peach peach = pb.getFruit();
        System.out.println("peach = " + peach);

        System.out.println("===========================");

        Basket basket = new Basket();

        basket.setFruit(new Peach());

        Peach peach2 = (Peach) basket.getFruit();

        System.out.println("=======================");

//        Basket<Water> waterBasket = new Basket<>();

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.setFruit(new Apple());
        fruitBasket.setFruit(new Peach());
//        fruitBasket.setFruit(new Water());


//        AppleBasket ab = new AppleBasket();
//        ab.setApple(new Apple());
//
//        Apple apple = ab.getApple();
//        System.out.println("apple = " + apple);
    }
}
