import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] teams = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        int[] teamsWins = new int[7];
        String team1 = "";
        String team2 = "";
        Scoreboard match;
        String winnerName = "";
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()){
            team1 = s.next();
            team2 = s.next();
            match = new Scoreboard(team1, team2);
            while (s.hasNextInt()) match.recordPlay(s.nextInt());
            winnerName = match.returnWinner();
            for (int i = 0; i < teams.length; i++){
                if (winnerName.equals(teams[i])) {
                    teamsWins[i] += 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < teams.length; i++){
            System.out.println(teams[i] + " "+ teamsWins[i]);
        }
    }
}