package day10.party;

import day09.inherit.player.Player;

public class Main {
    public static void main(String[] args) {

        //파티 생성
        Party party = new Party(3);

        //파티원 추가
        party.addPlayer(new Player("전사맨뽀로로"));
        party.addPlayer(new Player("안녕하셈까"));
        party.addPlayer(new Player("주차왕파킹"));
        party.addPlayer(new Player("매직왕마술사"));

        //파티원 추방
        System.out.println("=================================");
        party.kickPlayer("매직왕마술사");
        party.kickPlayer("전사맨뽀로로");

        party.addPlayer(new Player("멍청이"));

        //파티원 정보보기
        party.showPartyInfo();
    }
}
