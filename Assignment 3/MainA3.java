import java.text.NumberFormat;
import java.util.Locale;
public class MainA3 {

    public static void main(String[] args) {

        Locale locale = new Locale ("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance (locale);
        CrackerPacker matt = new CrackerPacker("Matt", 200, 10);
        CrackerPacker dave = new CrackerPacker("Dave", 1200, 60);
        System.out.println();
        System.out.println(matt.getName());
        System.out.println(matt.getNumberOfBoxes());
        System.out.println(matt.getWage());
        System.out.println(matt.finalWage());
        System.out.println(cf.format(matt.improvedFinalWage()));
        System.out.println(cf.format(dave.improvedFinalWage()));

    }
}
