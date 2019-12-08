import java.text.DecimalFormat;

public class MainA3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.##");
        CrackerPacker matt = new CrackerPacker("Matt", 200, 10);
        CrackerPacker dave = new CrackerPacker("Dave", 1200, 60);

        System.out.println(matt.getName());
        System.out.println(matt.getNumberOfBoxes());
        System.out.println(matt.getWage());
        System.out.println("£" + matt.finalWage());
        System.out.println("£" + df.format(matt.improvedFinalWage()));
        System.out.println("£" + df.format(dave.improvedFinalWage()));
    }
}
