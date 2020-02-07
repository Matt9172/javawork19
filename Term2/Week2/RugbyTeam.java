package Week2;

public class RugbyTeam {
    private String teamName;
    private int won;
    private int lost;
    private int drawn;
    private int score;


    public RugbyTeam(String teamName, int won, int lost, int drawn) {
        this.teamName = teamName;
        this.won = won;
        this.lost = lost;
        this.drawn = drawn;

    }

    public int getWon() {
        return won;
    }

    public void playGame (int t1, int t2){
        if (t1 > t2) {
            won =+1;
        }
        else if (t2 > t1){
            lost =+1;
        }
        else {
            drawn =+1;
        }
    }

    public String getScore (){
        score = ((won * 2)+(drawn));
        return teamName + " has " + score + " points! " ;
    }

    @Override
    public String toString() {
        return "Team Name: '" + teamName + '\'' +
                ", Won: " + won +
                ", Lost: " + lost +
                ", Drawn: " + drawn;
    }
}
