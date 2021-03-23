package day07;

//실행용 클래스는 main메서드를 포함합니다.
public class PhoneMain {
    public static void main(String[] args) {

        //객체의 생성
        Phone galaxyS20 = new Phone();

        //객체의 속성과 기능을 참조 : 참조연산자 . 을 사용
        galaxyS20.showSpec();

        System.out.println("======================");

        Phone iPhoneX = new Phone("아이폰x");
//        iPhoneX.model = "아이폰x";
        iPhoneX.showSpec();

        System.out.println("======================");

        Phone LgV6 = new Phone("LG V6");
        LgV6.showSpec();

    }

        /*//객체의 생성
        Phone galaxyS20 = new Phone();
        Phone iPhoneX = new Phone();

        //객체의 속성과 기능을 참조 : 참조연산자 . 을 사용
        galaxyS20.model = "갤럭시S20";
        galaxyS20.color = "펄 블루";
        galaxyS20.price = 1000000;

        iPhoneX.model = "아이폰X";
        iPhoneX.color = "스노우 화이트";
        iPhoneX.price = 1200000;

        galaxyS20.powerOn();
        galaxyS20.showSpec();

        iPhoneX.powerOn();
        iPhoneX.showSpec();
        iPhoneX.powerOff();
    }*/
}
