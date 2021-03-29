package day11.poly.car;

import day10.protect.pac2.D;

public class Main {
    public static void main(String[] args) {

       //다형성특징
        // 1. 객체의 교환성 증가
//        Car myCar = new Car();
//
//        mycar.frontLeft = new KumhoTire();
//        mycar.frontRight = new KumhoTire();

        //2. 다른 타입간 배열 구성 가능(이종 모음 배열)
        /*Tucson t1 = new Tucson();
        Car t2 = new Tucson();
        Car t3 = new Tucson();
        Sonata s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();
        Boxter b1 = new Boxter();
        Car b2 = new Boxter();
        Car b3 = new Boxter();
        Car b4 = new Boxter();

        Car[] cars = {t1,t2,t3,s1,s2,s3,b1,b2,b3,b4};
        for (Car car : cars){
            car.run();
        }*/

        Driver driver = new Driver();
        driver.drive(new Sonata());

        System.out.println("===========================");

//        Car myCar = driver.buyCar("소나타");
        Sonata myCar = (Sonata) driver.buyCar("소나타");
        driver.drive(myCar);

        myCar.joinMembership();

        Car[] cars2 = {myCar};

        System.out.println("==============================");

        CarShop shop = new CarShop();
        shop.sellCar(new Tucson());

//        "".equals(t2);

    }
}