package day09.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class)라고 부릅니다.
//상속은 is-a관계를 만족합니다.
public class Warrior extends Player {

    int rage;

    public Warrior(String nickName) {
        super(nickName);
        this.rage = 60;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

    public void fireSlash(Player target) {

        System.out.printf("%s님이 %s님에게 FireSlash를 시전했습니다!\n"
                , this.getNickname(), target.getNickname());
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.getNickname(), job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.getNickname(), target.hp);
        System.out.println();
    }
}