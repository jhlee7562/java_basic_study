package day09.inherit.player;

//공통 속성과 기능을 가진 클래스를 부모, 상위 클래스(super class)라고 부릅니다.
public class Player extends Object{

    //공통 필드
    String nickname;
    int level; //private 상속불가
    int hp;

    //생성자
    public Player(String nickname){
        System.out.println("플레이어 생성자 호출!!");
        this.nickname = nickname;
        this.level = 1;
        this.hp = level * 50;
    }

    //공통 메서드
    void attack(){
        System.out.printf("%s님이 공격합니다.\n", this.nickname);
    }
    public void info(){
        System.out.println("===========================");
        System.out.println("# 캐릭터명 : " + nickname);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);
    }
    public String getNickname(){
        return nickname;
    }
}
