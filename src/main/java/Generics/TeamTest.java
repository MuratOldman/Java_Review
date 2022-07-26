package Generics;

public class TeamTest {
    public static void main(String[] args) {
        
        FootballPlayer john= new FootballPlayer("john");
        BaseballPlayer dany=new BaseballPlayer("dany");
        SoccerPlayer alex=new SoccerPlayer("alex");
        
        
        Team<SoccerPlayer>City=new Team<>("City");
        //City.addPlayer(dany);
        //City.addPlayer(john);
        
        City.addPlayer(alex);
        System.out.println("City.numPlayers() = " + City.numPlayers());
    }
}
