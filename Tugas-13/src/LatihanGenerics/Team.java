/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanGenerics;

import java.util.ArrayList;

/**
 *
 * @author angga
 * @param <T>
 */

// Generic Bounded

public class Team<T extends Player> implements Comparable<Team<?>>, Standing<T> {
    
    private final String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    // Lower Bounded (Wildcard) 
    
    private final ArrayList<? super Player> members = new ArrayList<>();

    // Generic Method
    
    public <T> Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player<T> player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " sudah direkrut tim lain");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " direkrut tim " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    // Generic Method
    // Unbounded WildCard    
    public <T> void matchResult(Team<?> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " mengalahkan ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " seri melawan ";

        } else {
            lost++;
            message = " dikalahkan ";
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<?> team) {
        if (this.ranking() > team.ranking()) {
            return 1;
        }
        return 0;
    }

    // Generic Method
    
    @Override
    public <T> String standing(Team<?> team) {
        return compareTo(team) == 1 ? 
                this.getName() + " berada di atas " + team.getName():
                this.getName() + " berada di bawah " + team.getName();
    }
}
