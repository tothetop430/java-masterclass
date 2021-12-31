package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

        gameOver = true;
        score = 200;
        levelCompleted = 10;
        bonus = 200;

        System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));
        System.out.println(calculateScore(false, score, levelCompleted, bonus));

        //challenge
        displayHighScorePosition("abc", calculateHighScorePosition(1500));
        displayHighScorePosition("def", calculateHighScorePosition(900));
        displayHighScorePosition("ghi", calculateHighScorePosition(400));
        displayHighScorePosition("jkl", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score is = " + finalScore);
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " managed to get into position " + position +
                " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
