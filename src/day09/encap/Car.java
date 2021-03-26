package day09.encap;

public class Car {

    //주행기능
    public void drive() {
        //1. 시동 켜야함
        powerOn();
        //2. 기어를 D로 바꿔야함
        changeGear("D");
        //3. 악셀을 밟는다.
        accel();
    }

    //시동 켜는 기능
    private void powerOn() {
    }

    //기어 변속 기능
    private void changeGear(String gearType) {
    }

    //악셀링 기능
    private void accel(){

}
}
