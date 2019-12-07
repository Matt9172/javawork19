public class CrackerPacker {
 private String name;
 private int numberOfCrackers;
 private int numberOfBoxes;
 private double wage;

    public CrackerPacker(String name, int numberOfCrackers, int numberOfBoxes, double wage) {
        this.name = name;
        this.numberOfCrackers = numberOfCrackers;
        this.numberOfBoxes = numberOfBoxes;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCrackers() {
        return numberOfCrackers;
    }

    public void setNumberOfCrackers(int numberOfCrackers) {
        this.numberOfCrackers = numberOfCrackers;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public void setNumberOfBoxes(int numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double finalWage(double salary) {
        return numberOfBoxes*wage;
    }


}
