/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanGenerics;

/**
 *
 * @author angga
 */

public class LatihanGenerics {
    
    public static void main(String[] args) {
        
        Player<FootballPlayer> sabihis = new FootballPlayer("Sabihis");
        Player<FootballPlayer> dadang = new FootballPlayer("Dadang");
        Player<FootballPlayer> reny = new FootballPlayer("Reny");
        Player<BaseballPlayer> hartono = new BaseballPlayer("Hartono");
        Player<BaseballPlayer> suwarko = new BaseballPlayer("Suwarko");
        Player<SoccerPlayer> jaja = new SoccerPlayer("Jaja");
        Player<SoccerPlayer> munir = new SoccerPlayer("Munir");
        
        Team<FootballPlayer> sodongUnited = new Team<>("Sodong United");
        Team<FootballPlayer> ciguruwikUnited = new Team<>("Ciguruwik United");
        sodongUnited.addPlayer(sabihis);
        ciguruwikUnited.addPlayer(dadang);
        ciguruwikUnited.addPlayer(reny);
        
        System.out.println("Jumlah pemain Sodong United : " + sodongUnited.numPlayers());
        System.out.println("Jumlah pemain Ciguruwik United : " + ciguruwikUnited.numPlayers());
        
        Team<BaseballPlayer> tarajuUnited = new Team<>("Taraju United");
        tarajuUnited.addPlayer(hartono);
        tarajuUnited.addPlayer(suwarko);

        System.out.println("Jumlah pemain Taraju United : " + tarajuUnited.numPlayers());
        
        Team<SoccerPlayer> cipageranUnited = new Team<>("Cipageran United");
        Team<SoccerPlayer> margahayuUnited = new Team<>("Margahayu United");
        cipageranUnited.addPlayer(jaja);
        cipageranUnited.addPlayer(munir);

        sodongUnited.matchResult(ciguruwikUnited,1,0);
        sodongUnited.matchResult(ciguruwikUnited,3,8);

        cipageranUnited.matchResult(margahayuUnited, 2, 1);
        cipageranUnited.matchResult(margahayuUnited, 1,1);

        System.out.println("Rankings");
        System.out.println(sodongUnited.getName() + ": " + sodongUnited.ranking());
        System.out.println(ciguruwikUnited.getName() + ": " + ciguruwikUnited.ranking());
        
        System.out.println(sodongUnited.standing(ciguruwikUnited));
        
        System.out.println(cipageranUnited.standing(margahayuUnited));
        
    }
}
