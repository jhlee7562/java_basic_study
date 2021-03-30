package day12.quiz;

public class Child extends Parent{

    public Child(String name){
        super(name); //숨겨져있는 코드 ()안에는 name을 불러온다.
        this.name = name;
    }
}
