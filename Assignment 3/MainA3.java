import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
public class MainA3 {
    private static DecimalFormat df2 = new DecimalFormat("##.##");

    public static void main(String[] args) {
        df2.setRoundingMode(RoundingMode.UP);
        CrackerPacker matt = new CrackerPacker("Matt", 200, 10);
        CrackerPacker dave = new CrackerPacker("Dave", 1200, 60);

        System.out.println(matt.getName());
        System.out.println(matt.getNumberOfBoxes());
        System.out.println(matt.getWage());
        System.out.println("£" + matt.finalWage());
        System.out.println("£" + df2.format(matt.improvedFinalWage()));
        System.out.println("£" + df2.format(dave.improvedFinalWage()));
    }
}
