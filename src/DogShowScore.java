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

        System.out.println("Dog 1 is: " + jeff.getName());
        System.out.println("Jeff is a: " + jeff.getBreed());
        System.out.println("Jeff's owner is: " + jeff.getOwner());
        System.out.println("Dog 2 is: " + frank.getName());
        System.out.println("Frank is a: " + frank.getBreed());
        System.out.println("Frank's owner is: " + frank.getOwner());
    }
}