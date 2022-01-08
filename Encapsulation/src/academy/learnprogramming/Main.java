package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//        player.name = "Lucky Player";
//        player.health = 100;
//        player.weapon = "No Encapsulation!";
//
//        player.loseHealth(10);
//        System.out.println(player.healthRemaining());
//
//        player.health = 1000; // Lucky Power
//        System.out.println(player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Smart Player", "Knowledge", 100);
        player.loseHealth(10);
        System.out.println(player.getHealth());

    }
}
