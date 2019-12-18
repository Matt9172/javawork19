package Assignment2;

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
        Dog frank = new Dog("Frank", "Golden Retriever", "John Smith");
        DogShowScore jeff_score1 =new DogShowScore("1", 9);
        DogShowScore jeff_score2 =new DogShowScore("2",7);
        DogShowScore jeff_score3 =new DogShowScore("3",5);
        DogShowScore frank_score1 =new DogShowScore("1", 8);
        DogShowScore frank_score2 =new DogShowScore("2",10);
        DogShowScore frank_score3 =new DogShowScore("3",6);

        jeff.addScore(jeff_score1);
        jeff.addScore(jeff_score2);
        jeff.addScore(jeff_score3);
        frank.addScore(frank_score1);
        frank.addScore(frank_score2);
        frank.addScore(frank_score3);

        System.out.println(jeff.getOwnerDetailsAsString());
        System.out.println(frank.getOwnerDetailsAsString());
        System.out.println("The number of events Jeff has entered is: " +jeff.getNumberOfEventsEntered ());
        System.out.println("The number of events Frank has entered is: " +frank.getNumberOfEventsEntered());
        System.out.println("Jeff's best event was: Event " +jeff.getBestEvent() + " | " + " He got a:" + jeff.getBestScore());
        System.out.println("Franks best event was: Event " +frank.getBestEvent() + " | " + " He got a:" + frank.getBestScore());
        System.out.println("Jeff's overall score was: " +jeff.getShowScore());
        System.out.println("Franks overall score was: " +frank.getShowScore());

        if(jeff.getShowScore()>frank.getShowScore())
            System.out.println(jeff.getName()+ " is the winner of the dog show!");
        else if(frank.getShowScore()>jeff.getShowScore())
            System.out.println(frank.getName()+ " is the winner of the dog show!");
        else System.out.println("It's a Draw!");

    }

}