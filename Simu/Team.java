package Simu;

import Players.Player;
import project.Venue;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private boolean result;
    private Venue venue;
    private ArrayList<Player> players;
    public Team(String teamName, boolean result, Venue venue, ArrayList<Player>players){

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
