package pl.jaczewski.m10_Java_Generics.Generics_challenge;

import java.util.ArrayList;

public class LeagueTable<T extends Team> {
    private String leagueName;

    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public int numberOfTeams (){
        return this.teams.size();
    }

    public void addTeam(T team){
        if (teams.contains(team)){
            System.out.println(team.getName() + " already exists.");
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to " + this.leagueName + ".");
        }
    }

    public int ranking(T team){
        return (team.getWon() * 3) + team.getTied();
    }

    public void displayTeams(){
        System.out.println(leagueName + ":");
        for (T team : teams) {
            ranking(team);
            System.out.println(team.getName() + ": " + ranking(team));
        }
    }

    public void displayRankingList(){
        teams.sort(new RankingSorter());
        System.out.println("Tabela (" + leagueName + "): ");
        System.out.println(teams);
    }
}
