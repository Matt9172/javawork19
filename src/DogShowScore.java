public class DogShowScore {

    private String event;
    private int score;

    public DogShowScore (String event, int score) {
        this.event = event;
        this.score = score;
    }

    public String getEvent () {
        return event;
    }

    public void setEvent (String event) {
        this.event = event;
    }

    public int getScore () {
        return score;
    }

    public void setScore (int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Dog jeff = new Dog("Jeff", "German Shepard", "Colin Peterson");

    }
}