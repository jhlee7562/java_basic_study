package day09.inherit.player;

public class Hunter extends Player{


    String beast;

    public Hunter(String nickname){
        super(nickname);
        this.beast = "멍멍이";
    }

    @Override
    public void info(){
        super.info();
        System.out.println("# 동물 : " + beast);
    }

    void frozenShot(){

    }
}
