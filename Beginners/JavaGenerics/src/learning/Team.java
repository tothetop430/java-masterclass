package learning;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private final String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already present in Team");
            return false;
        }
        else {
            members.add(player);
            System.out.println("Player " + player.getName() + " added to the team.");
            return true;
        }
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (theirScore < ourScore) won++;
        else if (theirScore == ourScore) tied++;
        else lost++;
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(this.ranking(), team.ranking());
    }
}
