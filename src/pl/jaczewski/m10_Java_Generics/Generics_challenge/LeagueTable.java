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
        for (int i = 0; i < teams.size(); i++){
            ranking(teams.get(i));
            System.out.println(teams.get(i).getName() + ": " + ranking(teams.get(i)));
        }
    }

    public void displayRankingList(){
        teams.sort(new RankingSorter());
        System.out.println("Tabela (" + leagueName + "): ");
        System.out.println(teams);
    }
}
