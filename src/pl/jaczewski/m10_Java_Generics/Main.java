package pl.jaczewski.m10_Java_Generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer lewandowski = new FootballPlayer("Lewandowski");
        FootballPlayer wawrzyniak = new FootballPlayer("Wawrzyniak");
        FootballPlayer grosicki = new FootballPlayer("Grosicki");

        BasketballPlayer jordan = new BasketballPlayer("Jordan");

        VolleyballPlayer glinka = new VolleyballPlayer("Glinka");

        Team<FootballPlayer> nationalFootMen = new Team<>("Reprezentacja szmacianki");
        nationalFootMen.addPlayer(lewandowski);
        nationalFootMen.addPlayer(wawrzyniak);
        nationalFootMen.addPlayer(grosicki);
//        nationalFootMen.addPlayer(jordan);       <= nie można dodać zawodnika innego typu
//        System.out.println(nationalFootMen.numberOfPlayers());

        Team<BasketballPlayer> nba = new Team<>("NBA");
        nba.addPlayer(jordan);

        Team<VolleyballPlayer> nationalVolWomenPol = new Team<>("Reprezentacja Polski");
        nationalVolWomenPol.addPlayer(glinka);

        Team<VolleyballPlayer> nationalVolWomenIta = new Team<>("Reprezentacja Włoch");
        Team<VolleyballPlayer> nationalVolWomenBra = new Team<>("Reprezentacja Brazylii");

        nationalVolWomenPol.matchResult(nationalVolWomenIta, 3, 2);
        nationalVolWomenPol.matchResult(nationalVolWomenBra, 3, 0);
        nationalVolWomenBra.matchResult(nationalVolWomenIta, 3, 1);
        //nationalFootMen.matchResult(nationalVolWomenBra, 8, 0);     <= nie można porównać drużyn różnych typów

    }
}
