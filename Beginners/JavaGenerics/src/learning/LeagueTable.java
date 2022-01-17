package learning;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> teamArrayList;

    public LeagueTable(String name) {
        this.name = name;
        this.teamArrayList = new ArrayList<>();
    }

    public void add(T team) {
        if (teamArrayList.contains(team)) return;
        teamArrayList.add(team);
        System.out.println("Added " + team.getName() + " to the league table");
    }

    public void showLeagueTable() {
        Collections.sort(teamArrayList);
        for (T t : teamArrayList) {
            System.out.println(t.getName() + " -> " + t.ranking());
        }
    }
}
