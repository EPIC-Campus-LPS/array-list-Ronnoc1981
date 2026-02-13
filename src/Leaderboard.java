import java.util.ArrayList;

public class Leaderboard {
    private int capacity;
    private ArrayList<Score> scoreboard = new ArrayList<>();

    public Leaderboard(int c){
        capacity = c;
    }

    public void addScore(String n, int s){
        Score buns = new Score(s, n);
        int index = 0;
        if (scoreboard.isEmpty()){
            scoreboard.add(buns);
        }else {
            for (Score scores : scoreboard) {
                if (scores.getScore() > buns.getScore()) {
                    index++;
                }
            }
            scoreboard.add(index, buns);
        }
        if (scoreboard.size() > capacity){
            scoreboard.remove(scoreboard.size() - 1);
        }
    }

    public int getHighScore(){
        return scoreboard.get(0).getScore();
    }

    public int getAverageScore(){
        int avg = 0;
        for(Score s : scoreboard){
            avg += s.getScore();
        }
        return avg/scoreboard.size();
    }

    public boolean break1000(){
        return scoreboard.get(0).getScore() > 1000;
    }

    public void printLeaderboard(){
        for(Score s : scoreboard){
            System.out.println(s.toString());
        }
    }
}
