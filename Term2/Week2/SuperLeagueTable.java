package Week2;

public class SuperLeagueTable {

    public static void main(String[] args) {
        RugbyTeam cas = new RugbyTeam ("Castleford Tigers");
        RugbyTeam leeds = new RugbyTeam("Leeds Rhinos");
        System.out.println(cas.getScore());
        cas.playGame(20,10);
        cas.playGame(10,12);
        cas.playGame(16,16);
        leeds.playGame(10,20);
        leeds.playGame(12,10);
        leeds.playGame(16,16);

        System.out.println(cas);
        System.out.println(cas.getScore());
        System.out.println(leeds);
        System.out.println(leeds.getScore());


    }

}
