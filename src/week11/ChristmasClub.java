package week11;

import java.util.ArrayList;

public class ChristmasClub {

    private static ArrayList <String> members;

    public ChristmasClub(ArrayList<String> members) {
        this.members = members;
    }

    public ArrayList <String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public static void main(String[] args) {
        members = new ArrayList <> ();
        members.add ("Gary", 27);
    }






}
