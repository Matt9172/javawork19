package Week1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherStation {
    double reading;

    public WeatherStation(double reading) {
        this.reading = reading;

    }


    public static void main(String[] args) {
        ArrayList<String> readings = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println( "Enter Reading:" + i);
            String reading = in.nextLine();
            readings.add(reading + "c");
            System.out.println(readings);

            System.out.println(" The number of readings is: " + readings.size());
        }

    }
}
