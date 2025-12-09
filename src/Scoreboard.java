public class Scoreboard {
    private String team1;
    private String team2;
    private int team1Points = 0;
    private int team2Points = 0;
    private String activeTeam;
    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        activeTeam = team1;
    }
    public void recordPlay(int points) {
        if (activeTeam.equals(team1)) {
            if (points == 0) activeTeam = team2;
            team1Points += points;
        } else {
            if (points == 0) activeTeam = team1;
            team2Points += points;
        }
    }
    public String returnWinner(){
        if (team1Points > team2Points) return team1;
        else if (team2Points > team1Points) return team2;
        return "";
    }
}
