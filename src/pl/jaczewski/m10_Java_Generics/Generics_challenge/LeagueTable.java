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
}
