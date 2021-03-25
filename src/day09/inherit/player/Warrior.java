package day09.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위클래스(sub class)라고 부릅니다.
//상속은 is-a관계를 만족합니다.
public class Warrior extends Player{

    int rage;

    public Warrior(String nickname){
        super(nickname);
        this.nickname = nickname;
        this.rage = 60;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    void info(){
        super.info();
        System.out.println("# 분노 : " + rage);
    }


    void fireSlash(){

    }
}
