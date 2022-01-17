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


        FootballPlayer foe = new FootballPlayer("Foe");
        BaseballPlayer bas = new BaseballPlayer("Bas");
        SoccerPlayer soc = new SoccerPlayer("Soc");

        Team<FootballPlayer> team = new Team<>("TeaM");
        team.addPlayer(foe);
        System.out.println(team.numPlayers());

        Team<BaseballPlayer> team1 = new Team<>("Baseball Team");
        team1.addPlayer(bas);


    }

    private static void printDoubled(ArrayList<Integer> arrayList) {
        for (int i: arrayList) {
            System.out.println(i*2);
        }
    }
}
