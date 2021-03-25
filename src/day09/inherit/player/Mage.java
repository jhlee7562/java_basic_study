package day09.inherit.player ;

public class Mage extends Player{


    int mana;

    public Mage(String nickname){
        super(nickname);
        this.mana = 100;
    }

    @Override
    void info(){
        super.info();
        System.out.println("마나 : " + mana);
    }

    void meteo(){

    }
}
