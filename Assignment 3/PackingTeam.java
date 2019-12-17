import java.util.ArrayList;

public class PackingTeam {

    private ArrayList <String> packers;

    public PackingTeam () {
        packers = new ArrayList<> ();
    }

    public PackingTeam(ArrayList<String> packers) {
        this.packers = packers;
    }

    public void addPacker (CrackerPacker cp) {
        this.packers.add (cp);

    }


    public ArrayList<String> getPackers() {
        return packers;
    }

    public void setPackers(ArrayList<String> packers) {
        this.packers = packers;
    }

}