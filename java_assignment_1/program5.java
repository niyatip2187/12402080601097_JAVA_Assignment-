// Base class
class Cricket {
    String team1, team2;

    // Constructor
    Cricket(String t1, String t2) {
        team1 = t1;
        team2 = t2;
    }

    void showTeams() {
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);
    }
}

// Derived class
class Match extends Cricket {
    int score1, score2;

    // Constructor
    Match(String t1, String t2, int s1, int s2) {
        super(t1, t2); // call parent constructor
        score1 = s1;
        score2 = s2;
    }

    void showResult() {
        System.out.println("Score of " + team1 + ": " + score1);
        System.out.println("Score of " + team2 + ": " + score2);

        if (score1 > score2) {
            System.out.println(team1 + " wins!");
        } else if (score2 > score1) {
            System.out.println(team2 + " wins!");
        } else {
            System.out.println("Match Draw!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Command line arguments
        String team1 = args[0];
        String team2 = args[1];
        int score1 = Integer.parseInt(args[2]);
        int score2 = Integer.parseInt(args[3]);

        Match obj = new Match(team1, team2, score1, score2);

        obj.showTeams();
        obj.showResult();
    }
}
