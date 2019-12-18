package Assignment3;
import java.util.ArrayList;

public class PackingTeam {

    private static ArrayList<String> packers;

    public PackingTeam () {
        packers = new ArrayList<>();
    }

    public PackingTeam(ArrayList<String> packers) {
        PackingTeam.packers = packers;
    }

    public ArrayList<String> getPackers() {
        return packers;
    }

    public void setPackers(ArrayList<String> packers) {
        PackingTeam.packers = packers;
    }

    public static void main(String[] args) {
        packers = new ArrayList<>();

        packers.add("Steve");
        System.out.println(packers);
    }

}