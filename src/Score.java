public class Score {

    private int score;
    private String name;

    public Score(int s, String trip){
        score = s;
        name = trip;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "Player: " + name + "  Score: " + score;
    }
}
