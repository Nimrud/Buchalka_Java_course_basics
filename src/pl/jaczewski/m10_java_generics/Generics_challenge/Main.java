package pl.jaczewski.m10_java_generics.Generics_challenge;

public class Main {
    public static void main(String[] args) {
        HockeyTeam podhale = new HockeyTeam("Podhale", 5, 3, 0, 2);
        HockeyTeam unia = new HockeyTeam("Unia Oświęcim", 5, 2, 2, 1);
        HockeyTeam zaglebie = new HockeyTeam("Zagłębie", 5, 1, 2, 3);
        HockeyTeam stoczniowiec = new HockeyTeam("Stoczniowiec", 5, 0, 4, 1);
        FootballTeam legia = new FootballTeam("Legia", 10, 6, 3, 1);
        LeagueTable<HockeyTeam> hockeyLeague = new LeagueTable<>("Liga hokeja");
        hockeyLeague.addTeam(zaglebie);
        hockeyLeague.addTeam(podhale);
        hockeyLeague.addTeam(stoczniowiec);
        hockeyLeague.addTeam(unia);
        //hockeyLeague.addTeam(legia);    <= zgodnie z założeniem nie pozwala na dodanie
        System.out.println("Liczba drużyn (" + hockeyLeague.getLeagueName() + "): " + hockeyLeague.numberOfTeams());
        System.out.println("Ranking drużyny " + podhale.getName() + ": " + hockeyLeague.ranking(podhale));

        System.out.println();
        hockeyLeague.displayTeams();

        System.out.println();
        hockeyLeague.displayRankingList();
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