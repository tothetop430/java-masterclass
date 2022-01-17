package learning;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
////        arrayList.add("Sid");
//        arrayList.add(4);
//        arrayList.add(5);
//
//        printDoubled(arrayList);

//        FootballPlayer foe = new FootballPlayer("Foe");
//        BaseballPlayer bas = new BaseballPlayer("Bas");
//        SoccerPlayer soc = new SoccerPlayer("Soc");
//
//        Team<FootballPlayer> team = new Team<>("TeaM");
//        team.addPlayer(foe);
//        System.out.println(team.numPlayers());
//
//        Team<BaseballPlayer> team1 = new Team<>("Baseball Team");
//        team1.addPlayer(bas);

        Team<FootballPlayer> team1 = new Team<>("team 1");
        Team<FootballPlayer> team2 = new Team<>("team 2");
        Team<FootballPlayer> team3 = new Team<>("team 3");
        Team<FootballPlayer> team4 = new Team<>("team 4");

        Team<BaseballPlayer> baseTeam = new Team<>("baseTeam");

        LeagueTable<Team<FootballPlayer>> leagueTable = new LeagueTable<>("Football League");
        leagueTable.add(team1);
        leagueTable.add(team2);
        leagueTable.add(team3);
        leagueTable.add(team4);

        team1.matchResult(team2, 10, 4);
        team1.matchResult(team3, 0, 4);
        team1.matchResult(team4, 5, 5);

        team2.matchResult(team1, 1, 1);
        team2.matchResult(team3, 10, 4);
        team2.matchResult(team4, 6, 2);

        team3.matchResult(team2, 10, 4);
        team3.matchResult(team1, 10, 4);
        team3.matchResult(team4, 5, 5);

        team4.matchResult(team2, 10, 4);
        team4.matchResult(team3, 10, 4);
        team4.matchResult(team1, 15, 5);

        leagueTable.showLeagueTable();


    }

    private static void printDoubled(ArrayList<Integer> arrayList) {
        for (int i: arrayList) {
            System.out.println(i*2);
        }
    }
}
