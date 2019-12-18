package Assignment3;

public class CrackerPacker {
 private String name;
 private int numberOfCrackers;
 private double numberOfBoxes;
 private double wage;

    public CrackerPacker(String name, int numberOfCrackers, double numberOfBoxes) {
        this.name = name;
        this.numberOfCrackers = numberOfCrackers;
        this.numberOfBoxes = numberOfBoxes;
    }

    public CrackerPacker(String name, int numberOfCrackers, double numberOfBoxes, double wage) {
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

    public double getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public void setNumberOfBoxes(double numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double finalWage() {
        return numberOfBoxes * wage;

    }
    public double improvedFinalWage(){
        if (numberOfBoxes >50) {
            double fw = (50 * 1.11) + (numberOfBoxes - 50) * 1.25;
            return fw;
        }
        else {
            double fw = numberOfBoxes * 1.11;
            return fw;
        }
    }

}
