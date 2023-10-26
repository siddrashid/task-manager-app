package methodChallenge;

public class Report {
    public static void main(String[] args) {
        int score = 25;
        byte position = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);
    }

    public static void displayHighScorePosition(String name, byte position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static byte calculateHighScorePosition(int score) {
        byte position = 0;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
