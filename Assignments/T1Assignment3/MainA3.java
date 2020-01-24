package T1Assignment3;

import java.text.NumberFormat;
import java.util.Locale;
public class MainA3 {

    public static void main(String[] args) {

        Locale locale = new Locale ("en", "GB");
        NumberFormat cf = NumberFormat.getCurrencyInstance (locale);
        CrackerPacker bob = new CrackerPacker("Bob",2000, 100);
        CrackerPacker matt = new CrackerPacker("Matt", 200, 110);


        System.out.println(bob);
        System.out.println("Bob's final wage is: " + cf.format(bob.improvedFinalWage()));
        System.out.println(matt);
        System.out.println("Matt's final wage is: " + cf.format(matt.improvedFinalWage()));


        if (bob.getNumberOfBoxes() > matt.getNumberOfBoxes())
            System.out.println("Bob has packed the most boxes! ");
        else if (matt.getNumberOfBoxes() > bob.getNumberOfBoxes())
            System.out.println("Matt has packed the most boxes! ");
        else
            System.out.println("They have packed the same amount of boxes. ");



    }
}
