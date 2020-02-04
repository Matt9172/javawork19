package Week2;

public class SuperLeagueTable {

    public static void main(String[] args) {
        RugbyTeam cas = new RugbyTeam ("Castleford Tigers", 0,0,0 );
        RugbyTeam leeds = new RugbyTeam("Leeds Rhinos", 0,0,0);
        System.out.println(cas.getScore());
        cas.playGame(20, 10);
        cas.playGame(10,12);
        cas.playGame(16,16);


        System.out.println(cas);
        System.out.println(cas.getScore());
    }

}
