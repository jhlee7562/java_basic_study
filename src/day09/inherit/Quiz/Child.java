package day09.inherit.Quiz;

public class Child extends Parent{
    private String name;

    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }
}