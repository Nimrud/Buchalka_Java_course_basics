package pl.jaczewski.m10_Java_Generics.Generics_challenge;

import java.util.Comparator;

public class RankingSorter implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {
        int o1rank = o1.getWon() * 3 + o1.getTied();
        int o2rank = o2.getWon() * 3 + o2.getTied();
        return Integer.compare(o2rank, o1rank);
    }
}
