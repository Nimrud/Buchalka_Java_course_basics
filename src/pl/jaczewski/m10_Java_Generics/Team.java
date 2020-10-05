package pl.jaczewski.m10_Java_Generics;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            System.out.println(player.getName() + " added to team " + this.teamName + ".");
            members.add(player);
            return true;
        }
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message;

        if (ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore < theirScore){
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponent != null){
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}
