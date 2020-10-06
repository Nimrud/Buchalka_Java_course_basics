package pl.jaczewski.m10_Java_Generics.Generics_challenge;

public class Main {
    public static void main(String[] args) {
        HockeyTeam podhale = new HockeyTeam("Podhale", 5, 3, 0, 2);
        FootballTeam legia = new FootballTeam("Legia", 10, 6, 3, 1);
        LeagueTable<HockeyTeam> hockeyleague = new LeagueTable<>("Liga hokeja");
        hockeyleague.addTeam(podhale);
        hockeyleague.addTeam(podhale);
        System.out.println("Liczba drużyn (" + hockeyleague.getLeagueName() + "): " + hockeyleague.numberOfTeams());
        System.out.println("Ranking drużyny " + podhale.getName() + ": " + hockeyleague.ranking(podhale));
    }
}


// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.