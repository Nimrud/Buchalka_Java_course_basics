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

    public boolean addTeam(T team){
        if (teams.contains(team)){
            System.out.println(team.getName() + " already exists.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to " + this.leagueName + ".");
            return true;
        }
    }

    public int ranking(T team){
        return (team.getWon() * 3) + team.getTied();
    }

    public void displayRankingList(){
        //TODO
    }
}
